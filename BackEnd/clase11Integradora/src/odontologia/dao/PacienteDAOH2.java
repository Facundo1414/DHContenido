package odontologia.dao;

import odontologia.entities.Domicilio;
import odontologia.entities.Paciente;
import odontologia.service.PacienteService;
import org.apache.log4j.Logger;

import java.sql.*;

public class PacienteDAOH2 implements idao<Paciente>{

    public PacienteDAOH2( ) {
        crearTabla();
    }

    private static final String SQL_DROP_CREATE="DROP TABLE IF EXISTS PACIENTES; " +
            "CREATE TABLE PACIENTES (ID BIGINT PRIMARY KEY, APELLIDO VARCHAR(100) NOT NULL, " +
            "NOMBRE VARCHAR(100) NOT NULL, DNI VARCHAR(100) NOT NULL, " +
            "FECHA_DE_INGRESO VARCHAR(100) NOT NULL, DOMICILIO VARCHAR(100) NOT NULL)";
    private static final String SQL_INSERT="INSERT INTO PACIENTES (APELLIDO,NOMBRE,DNI,FECHA_DE_INGRESO,DOMICILIO) VALUES(?,?,?,?,?)";
    private static final String SQL_DELETE="DELETE FROM PACIENTES WHERE id = ?";
    private static final String SQL_SELECTbyID="SELECT * FROM PACIENTES WHERE id = ?";
    private static final String SQL_SELECTAll="SELECT * FROM PACIENTES";
    private DomicilioDAOH2 domicilioEstrategia = new DomicilioDAOH2();
    private static final Logger logger= Logger.getLogger(PacienteDAOH2.class);




    public static void crearTabla(){
        Connection connection = null;
        try {
            connection = DB.getConnection();
            Statement statement = connection.createStatement();
            // tabla con Objeto Domicilio
            statement.execute(SQL_DROP_CREATE);
            logger.info("Tabla creada con exito");

            // CREAMOS LAS DE DOMICILIO TAMBIEN
            DomicilioDAOH2.crearTabla();

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
    public Paciente guardar(Paciente paciente) {
        Connection connection = null;

        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);

            DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
            Domicilio domicilio = domicilioDAOH2.guardar(paciente.getDomicilio());

            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT,Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,paciente.getApellido());
            preparedStatement.setString(2,paciente.getNombre());
            preparedStatement.setString(3,paciente.getDni());
            preparedStatement.setString(4,paciente.getFechaDeIngreso());
            // como se guarda un objeto tipo Domicilio
            preparedStatement.setLong(5,domicilio.getId());
            preparedStatement.execute();
            // necesito las claves
            ResultSet clave = preparedStatement.getGeneratedKeys();
            while (clave.next()){
                paciente.setId(clave.getLong(1)); // de esta forma defino el id del nuevo paciente
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
        return null;
    }

    @Override
    public Paciente buscar(Long id) {
        Connection connection = null;

        try {
            connection = DB.getConnection();
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECTbyID);
            preparedStatement.setLong(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();



            while (resultSet.next()){
                System.out.println(resultSet.getLong("id")+resultSet.getString("Apellido")+
                        resultSet.getString("nombre")+resultSet.getString("Dni")+
                        resultSet.getString("Fecha de ingreso")+resultSet.getObject("Domicilio"));
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

            // buscamos lso domicilios
            domicilioEstrategia.buscarTodos();

            while (resultSet.next()){
                System.out.println(resultSet.getLong("id")+resultSet.getString("Apellido")+
                        resultSet.getString("nombre")+resultSet.getString("Dni")+
                        resultSet.getString("Fecha de ingreso")+resultSet.getObject("Domicilio"));
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
            // eliminamos el domicilio
            domicilioEstrategia.eliminar(id);

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
