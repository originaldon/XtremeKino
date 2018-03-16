package Controller;

import Model.Database;
import View.Menu;

import java.util.Scanner;

public class EditMovie {
    private static String movieTitle;
    private static String genre;
    private static String price;
    private static String movieLength;
    private static Database database = new Database();

    public static void editMovie() {
        int movieID;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Du kan til enhver til vende tilbage til menuen\n");
            System.out.println("Tast blot exit når der indtastes film titel og genre.\n");
            System.out.println("************************************************");
            System.out.println("Vælg filmens ID");
            movieID = scanner.nextInt();
            System.out.println("Tast filmens titel");
            movieTitle = scanner.nextLine();
            System.out.println("Skriv genren på filmen");
            genre = scanner.nextLine();
            System.out.println("Skriv prisen på filmen");
            price = scanner.nextLine();
            System.out.println("Tast længden på filmen");
            movieLength = scanner.nextLine();

            if (!movieTitle.equalsIgnoreCase("Exit") && !genre.equalsIgnoreCase("Exit")) {
                editMovieInput(movieID, movieTitle, genre, price, movieLength);
            } else {
                Menu.menu();
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    private static void editMovieInput(int movieID, String newTitle, String newGenre, String newPrice, String newLength){
        database.execute("UPDATE movie SET title = '" + newTitle + "', genre = '" + newGenre +
                "', price = '" + newPrice + "', length = '" + newLength + "' WHERE idMovie = '" + movieID + "'");
    }
}
