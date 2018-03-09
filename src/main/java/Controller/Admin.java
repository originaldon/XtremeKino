package Controller;

import Model.Database;
import View.Menu;

public class Admin{
    
    private Database database = new Database();

    Menu menu = new Menu();


    public boolean changePrice(int filmID, String newPrice){

            return database.execute("UPDATE movie SET price = '" + newPrice + "' Where idMovie = '" + filmID + "';");
    }

    public boolean createMovie (String movieTitle, String genre, String price, String movieLength ) {

        return database.execute("INSERT INTO movie (title, genre, price, length) VALUES('" + movieTitle + "', '" + genre + "','"
                + price + "', '" + movieLength + "');");

    }

    //til test / slettes
    public static void main(String[] args){

        Admin admin = new Admin();
        admin.changePrice(1 , "30kr");
    }
}