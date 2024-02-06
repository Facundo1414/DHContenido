package odontologia.dao;

import odontologia.entities.Domicilio;
import odontologia.entities.Paciente;
import org.apache.log4j.Logger;

import java.sql.*;

public class DomicilioDAOH2 implements idao<Domicilio>{

    private static final String SQL_DROP_CREATE="DROP TABLE IF EXISTS DOMICILIOS; " +
            "CREATE TABLE DOMICILIOS (ID BIGINT PRIMARY KEY, CALLE VARCHAR(100) NOT NULL, " +
            "NUMERO INT NOT NULL, LOCALIDAD VARCHAR(100) NOT NULL, " +
            "PROVINCIA VARCHAR(100) NOT NULL";
    private static final String SQL_INSERT="INSERT INTO DOMICILIOS VALUES(?,?,?,?,?)";
    private static final String SQL_DELETE="DELETE FROM DOMICILIOS WHERE id = ?";
    private static final String SQL_SELECTbyID="SELECT * FROM DOMICILIOS WHERE id = ?";
    private static final String SQL_SELECTAll="SELECT * FROM DOMICILIOS";
    private static final Logger logger= Logger.getLogger(PacienteDAOH2.class);

    public static void crearTabla(){
        Connection connection = null;

        try {
            connection = DB.getConnection();
            Statement statement = connection.createStatement();
            // tabla con Objeto Domicilio
            statement.execute(SQL_DROP_CREATE);
            logger.info("Tabla creada con exito");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                assert connection != null;
                connection.close();
            }catch (SQLException exception){
                exception.printStackTrace();
            }
        }
    }

    @Override
    public Domicilio guardar(Domicilio domicilio) {
        Connection connection = null;

        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);

            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setLong(1,domicilio.getId());
            preparedStatement.setString(2,domicilio.getCalle());
            preparedStatement.setInt(3,domicilio.getNumero());
            preparedStatement.setString(4,domicilio.getLocalidad());
            preparedStatement.setString(5,domicilio.getProvincia());
            preparedStatement.execute();

        }catch (Exception e){
            try {
                assert connection != null;
                connection.rollback();
            }catch (SQLException exception){
                e.printStackTrace();
            }
        }finally {
            try {
                assert connection != null;
                connection.close();
            }catch (SQLException exception){
                exception.printStackTrace();
            }
        }
        return domicilio;
    }

    @Override
    public Domicilio buscar(Long id) {
        Connection connection = null;

        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECTbyID);
            preparedStatement.setLong(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println(resultSet.getLong("id")+resultSet.getString("Calle")+
                        resultSet.getInt("numero")+resultSet.getString("Localidad")+
                        resultSet.getDouble("Provincia"));
            }

            return null;

        }catch (Exception e){
            try {
                assert connection != null;
                connection.rollback();
            }catch (SQLException exception){
                e.printStackTrace();
            }
        }finally {
            try {
                assert connection != null;
                connection.close();
            }catch (SQLException exception){
                exception.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void buscarTodos() {
        Connection connection = null;

        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_SELECTAll);

            while (resultSet.next()){
                System.out.println(resultSet.getLong("id")+resultSet.getString("Calle")+
                        resultSet.getInt("numero")+resultSet.getString("Localidad")+
                        resultSet.getDouble("Provincia"));
            }

        }catch (Exception e){
            try {
                assert connection != null;
                connection.rollback();
            }catch (SQLException exception){
                e.printStackTrace();
            }
        }finally {
            try {
                assert connection != null;
                connection.close();
            }catch (SQLException exception){
                exception.printStackTrace();
            }
        }
    }

    @Override
    public void eliminar(Long id) {
        Connection connection = null;

        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE);
            preparedStatement.setLong(1,id);
            preparedStatement.execute();

        }catch (Exception e){
            try {
                assert connection != null;
                connection.rollback();
            }catch (SQLException exception){
                e.printStackTrace();
            }
        }finally {
            try {
                assert connection != null;
                connection.close();
            }catch (SQLException exception){
                exception.printStackTrace();
            }
        }
    }
}
