package Controller;

import Model.Database;

public class Admin {
    private Database database = new Database();

    public boolean createBooking(String phone, String name, String movie, String hall, String row, String seats) {

        return database.execute("INSERT INTO booking (phone, name, movie, hall, row, seats) VALUES('" + phone + "','" + name
                + "', '" + movie + "', '" + hall + "', '" + row + "', '" + seats + "');");
    }
}