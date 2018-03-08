package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Database{

        private Connection connection;

        public Database() {

            DBconnection dBconnection = new DBconnection();
            connection = dBconnection.get();
        }

        public boolean execute(String sql) {

            boolean updated = false;
            try {
                Statement stmt = connection.createStatement();
                stmt.execute(sql);
                updated = stmt.getUpdateCount() > 0;
                stmt.close();
            } catch (SQLException e) {
                System.out.println("Database execute error: " + e);
            }
            return updated;
        }
}

