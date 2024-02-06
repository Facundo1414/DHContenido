package odontologia.dao;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    private static final String DB_JDBD_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:~/db_pacientesClinica";

    public static Connection getConnection() throws Exception{
        logger.info("REALIZANDO CONEXION CON LA BASE DE DATOS");
        Class.forName(DB_JDBD_DRIVER);
        return DriverManager.getConnection(DB_URL,"admin","admin");
    }

    private static final Logger logger= Logger.getLogger(DB.class);

}
