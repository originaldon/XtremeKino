package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
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

    public List<String[]> listBookings(String sql) {

        ArrayList<String[]> foundBookings = null;

        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);

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
                foundBookings.add(current);
                System.out.println();
            }

            resultSet.close();
            stmt.close();

        }catch (SQLException e){
            System.out.println("error" + e);
        }
        return foundBookings;

    }

    public List<String[]> listMovies(String sql) {

        ArrayList<String[]> foundMovies = null;

        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);

            if (resultSet.next()) {
                foundMovies = new ArrayList<String[]>();
                resultSet.previous();
            }
            while (resultSet.next()) {
                String[] current = new String[4];
                current[0] = resultSet.getString("title");
                current[1] = resultSet.getString("genre");
                current[2] = resultSet.getString("price");
                current[3] = resultSet.getString("length");
                foundMovies.add(current);
                System.out.println();
            }

            resultSet.close();
            stmt.close();

        }catch (SQLException e){
            System.out.println("error" + e);
        }
        return foundMovies;
    }
}

