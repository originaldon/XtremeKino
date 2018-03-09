package Controller;

import Model.Database;

public class EditMovie {

    Database database = new Database();

    public boolean changePrice(int filmID, String newPrice){

        return database.execute("UPDATE movie SET price = '" + newPrice + "' Where idMovie = '" + filmID + "';");
    }
    //til test / slettes
    public static void main(String[] args){

        Admin admin = new Admin();
        admin.changePrice(1 , "30kr");
    }
}
