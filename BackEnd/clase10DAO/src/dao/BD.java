package dao;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {
    private static final String SQL_DROP_CRATE = "DROP TABLE IF EXISTS MEDICAMENTOS;" +
            "CREATE TABLE CUENTAS (ID INT PRIMARY KEY, CODIGONUMERICO INT , NOMBRE VARCHAR(100) NOT NULL, LABORATORIOQUELOPRODUCE VARCHAR(100), CANTIDAD INT, PRECIO NUMERIC)";


    private static final void crearTabla(){
            Connection connection = null;
        try {
            connection = getconnection();
            logger.info("Conexion establecida con exito");

                //crear tabla
                Statement statement = connection.createStatement();
                statement.execute(SQL_DROP_CRATE);
        }catch (Exception e){
            try {
                connection.close();e.printStackTrace();
            }catch (SQLException exception){
                exception.printStackTrace();
            }

        }
    }

    private static final Logger logger = Logger.getLogger(BD.class);
    public static final Connection getconnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/testDAO","admin","admin");
    }

}
