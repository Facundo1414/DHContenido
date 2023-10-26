package jdbc;

import java.sql.*;
import java.util.logging.Logger;

public class FigurasJDBC {

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();

            statement.execute("DROP TABLE IF EXISTS FIGURAS; " +
                    "CREATE TABLE FIGURAS (ID INT PRIMARY KEY, TIPO VARCHAR(225) NOT NULL, COLOR VARCHAR(225))");
            statement.execute("INSERT INTO FIGURAS VALUES (1,'CIRCULO','ROJO')");
            statement.execute("INSERT INTO FIGURAS VALUES (2,'CIRCULO','ROJO')");
            statement.execute("INSERT INTO FIGURAS VALUES (3,'CUADRADO','ROJO')");
            statement.execute("INSERT INTO FIGURAS VALUES (4,'CUADRADO','ROJO')");
            statement.execute("INSERT INTO FIGURAS VALUES (5,'CUADRADO','ROJO')");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM FIGURAS WHERE TIPO = 'CIRCULO'");
            while (resultSet.next()){
                System.out.println("ID = " + resultSet.getInt(1) + " TIPO = " + resultSet.getString(2) + " COLOR = " + resultSet.getString(3));
            }
        }catch (Exception e){
            logger.warning("error");
            e.printStackTrace();
        }


    }

    private static final Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        logger.info("creando conexion");
        return DriverManager.getConnection("jdbc:h2:mem:~/test","sa","sa");
    }

    private static Logger logger = Logger.getLogger("FigurasJDBC.class");
}
