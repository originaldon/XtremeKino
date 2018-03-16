package Controller;

import Model.Database;

import java.util.List;

public class Admin {
    private Database database = new Database();

    public boolean createBooking(String phone, String name, String movie, String hall, String row, String seats) {

        return database.execute("INSERT INTO booking (phone, name, movie, hall, row, seats) VALUES('" + phone + "','" + name
                + "', '" + movie + "', '" + hall + "', '" + row + "', '" + seats + "');");
    }

    public boolean deleteBooking(String idbooking){

        return database.execute("DELETE FROM booking WHERE idbooking='" + idbooking + "';");

    }

    public List<String[]> findBooking(String phone){

        return database.listBookings("SELECT * FROM booking WHERE phone='" + phone + "'");

    }

    public void editBooking(String idbooking, String phone, String name, String movie, String hall, String row, String seats){

        database.execute("UPDATE booking SET phone = '" + phone + "', name = '" + name + "', movie = '" + movie + "', hall = '" + hall + "', row = '" + row + "', seats = '" + seats + "' " +
                "WHERE idbooking = '" +idbooking + "';");
    }

}