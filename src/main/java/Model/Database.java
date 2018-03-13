package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
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

    public List<String[]> listBookings(String phone) {

        ArrayList<String[]> foundBookings = null;

        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM booking WHERE WHERE phone='" + phone + "');");

            if (resultSet.next()) {
                foundBookings = new ArrayList<String[]>();
                resultSet.previous();
            }
            while (resultSet.next()) {
                String[] current = new String[7];
                current[0] = resultSet.getString("idbooking");
                current[1] = resultSet.getString("phone");
                current[2] = resultSet.getString("name");
                current[3] = resultSet.getString("movie");
                current[4] = resultSet.getString("hall");
                current[5] = resultSet.getString("row");
                current[6] = resultSet.getString("seats");

            }

            resultSet.close();
            stmt.close();

        }catch (SQLException e){
            System.out.println("error" + e);
        }
        return foundBookings;

    }
}

