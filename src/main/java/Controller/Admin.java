package Controller;

import Model.Database;

import java.util.List;

public class Admin {
    private Database database = new Database();

    public boolean createBooking(String phone, String name, String movie, String hall, String row, String seats) {

        return database.execute("INSERT INTO booking (phone, name, movie, hall, row, seats) VALUES('" + phone + "','" + name
                + "', '" + movie + "', '" + hall + "', '" + row + "', '" + seats + "');");
    }

    public boolean deleteBooking(String phone){

        return database.execute("DELETE FROM booking WHERE phone='" + phone + "';");

    }

    public List<String[]> findBooking(String phone){

        return database.listBookings("SELECT * FROM booking WHERE phone='" + phone + "';");

    }

}