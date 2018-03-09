package Controller;

import Model.Database;
import View.Menu;

public class Admin {

    private Database database = new Database();

    Menu menu = new Menu();


    public boolean changePrice(int filmID, String newPrice) {

        return database.execute("UPDATE movie SET price = '" + newPrice + "' Where idMovie = '" + filmID + "';");
    }

    public boolean createMovie(String movieTitle, String genre, String price, String movieLength) {

        return database.execute("INSERT INTO movie (title, genre, price, length) VALUES('" + movieTitle + "', '" + genre + "','"
                + price + "', '" + movieLength + "');");

    }

    public boolean createBooking(String venue, String phone, String row, String seats) {

        return database.execute("INSERT INTO booking (title, genre, price, length) VALUES('" + movieTitle + "', '" + genre + "','"
                + price + "', '" + movieLength + "');");

    }
}

