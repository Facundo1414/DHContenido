import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;


public class Connect {

    public static void main(String[] args) {

            Connection connection = null;

            try {
                connection = getConnection();
                logger.info("Creando conexion");
                Statement statement = connection.createStatement();

                statement.execute("DROP TABLE IF EXISTS EMPLEADO; " +
                        "CREATE TABLE EMPLEADO(ID INT PRIMARY KEY, NAME VARCHAR(255),EDAD INT,EMPRESA VARCHAR(255),FECHA_DE_ALTA VARCHAR(255));");
                logger.info("Tabla creada");
                statement.execute("INSERT INTO EMPLEADO VALUES (1, 'Juan', 18, 'Digital', '12/10/2022')");
                statement.execute("INSERT INTO EMPLEADO VALUES (2, 'Lucia', 28, 'Google', '12/10/2021')");
                statement.execute("INSERT INTO EMPLEADO VALUES (3, 'Jose', 32, 'Facebook', '06/05/2021')");

                ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLEADO");
                while (resultSet.next()){
                    System.out.println(
                            "ID: " + resultSet.getInt(1)+
                                    "Name: " + resultSet.getString(2)+resultSet.getInt(3)+ resultSet.getString(4)+ resultSet.getString(5));
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }




    private static final Logger logger = java.util.logging.Logger.getLogger(String.valueOf(Connect.class));

    private static final Connection getConnection () throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/test","root","root");
    }


}
