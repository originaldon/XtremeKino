package Model;

import java.sql.Connection;
import java.sql.DriverManager;

class DBconnection {

    Connection get(){
        final String DB_URL = "jdbc:mysql://mytestdatabase.ckydpuyqdezc.eu-west-2.rds.amazonaws.com/KinoXP";
        final String USER = "nilas";
        final String PASS = "nydatabase";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            //System.out.println("connected");
        } catch (Exception e) {
            System.out.println("Connection Error:" + e);
        }
        return connection;
    }
}