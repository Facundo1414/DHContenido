package baseDeDatos;

import org.apache.log4j.Logger;

import java.sql.*;

public class Cuenta {
    //
    private static final String SQL_DROP_CRATE = "DROP TABLE IF EXISTS CUENTAS;" +
            "CREATE TABLE CUENTAS (ID INT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL, NUMEROCUENTA INT NOT NULL, SALDO NUMERIC(10,2) NOT NULL)";
    // EJEMPLO DE NUMERIC = 12345678,90
    private static final String SQL_INSERT = "INSERT INTO CUENTAS VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE CUENTAS SET SALDO=? WHERE ID=? ";
    private static final String SQL_SELECT = "SELECT * FROM CUENTAS";


    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = getconnection();
            logger.info("Conexion establecida con exito");

            //crear tabla
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CRATE);
            // insertar en la fila
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
            // ahora cargamos los datos
            psInsert.setInt(1,1);
            psInsert.setString(2,"Jose");
            psInsert.setInt(3,121123231);
            psInsert.setDouble(4,250);
            //
            psInsert.execute();

            // ahora con el update
            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            //agregamops 10 al saldo de modo de ejemplo
            psUpdate.setDouble(1,250+10);
            psUpdate.setInt(2,1);
            psUpdate.execute();

            // desactivamos el auto commit
            connection.setAutoCommit(false);

            //ahora agregamos nuevamente a modo de ejemplo una transaccion
            PreparedStatement psUpdateTx = connection.prepareStatement(SQL_UPDATE);
            //agregamops 10 al saldo de modo de ejemplo
            psUpdateTx.setDouble(1,250+10+15);
            psUpdateTx.setInt(2,1);
            psUpdateTx.execute();

            // vamos a generar una excepion a modo de ejemplo
            connection.commit();

        }catch (Exception e){
            try {
                logger.error("Error en la conexion");
                connection.rollback();
                e.printStackTrace();
            }catch (Exception exception){
                exception.printStackTrace();
            }

        }
        finally {
            try {
                connection.close();
                logger.info("Conexion cerrada");
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    private static final Logger logger = Logger.getLogger(Cuenta.class);
    private static final Connection getconnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/testCuenta","admin","admin");
    }
}
