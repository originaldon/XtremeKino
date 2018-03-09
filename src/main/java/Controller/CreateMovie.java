package Controller;

import Model.Database;
import View.Menu;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class CreateMovie {
    private static String movieTitle;
    private static String genre;
    private static String price;
    private static String movieLength;

    public static void createMovies() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Du kan til enhver til vende tilbage til menuen\n");
            System.out.println("Tast blot exit i felterne\n");
            System.out.println("************************************************\n");
            System.out.println("Felt 1: Tast filmens titel\n");
            movieTitle = scanner.nextLine();
            //movieTitle = title;
            System.out.println("Felt 2: Skriv genren på filmen\n");
            genre = scanner.nextLine();
            //genre = g;
            System.out.println("Felt 3: Tast filmens pris\n");
            price = scanner.nextLine();
            //price = p;
            System.out.println("Felt 4: tast længden på filmen\n");
            movieLength = scanner.nextLine();
            //movieLength = l;

            if (!movieTitle.equalsIgnoreCase("Exit") && !genre.equalsIgnoreCase("Exit") &&
                    !price.equalsIgnoreCase("Exit") && !movieLength.equalsIgnoreCase("Exit")) {

                createMovie(movieTitle, genre, price, movieLength);

            } else {
                Menu.menu();
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    private static boolean createMovie(String movieTitle, String genre, String price, String movieLength){

        Database database = new Database();
        return database.execute("INSERT INTO movie (title, genre, price, length) " +
                "VALUES('"+ movieTitle + "', '" + genre + "', '" + price + "', '" + movieLength + "')");
    }
}
