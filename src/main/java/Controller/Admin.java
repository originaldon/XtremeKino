package Controller;

import Model.Database;
import View.Menu;

public class Admin {

    private Database database = new Database();

    public boolean createBooking(String venue, String phone, String row, String seats) {

        return database.execute("INSERT INTO booking (title, genre, price, length) VALUES('" + venue + "', '" + phone + "','"
                + row + "', '" + seats + "');");
    }
}