package View;

import Model.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Movies {

    private String movieTitle;
    private String genre;
    private String price;
    private String movieLength;


    @Override
    public String toString() {
        return "FILMENS TITEL: : " + movieTitle + " MOVIE GENRE: " + genre + "PRICE FOR SHOWING: " + price
                + "LENGTH OF MOVIE: " + movieLength + "/n";
    }

    public void menu() {

        try {
            Scanner scanner = new Scanner(System.in);
            String choise = "";
            System.out.println("Her kan du oprette eller fjerne film");
            System.out.println(" Opret | Fjern");
            choise = scanner.next();
            if (choise.equalsIgnoreCase("opret")) {
                createMovies();

                //} else if (choise.equalsIgnoreCase("fjern")) {
                //    alterTheCurrentMovie();

            } else {
                System.out.println("Try again");
                menu();
            }
        } catch (Exception E) {
            System.out.println(E);
        }
    }

    public void createMovies() {

        try {
            Scanner scanner = new Scanner(System.in);


            String a = "";
            System.out.println("DU KAN TIL ENHVER TID VENDE TILBAGE TIL MENUEN");
            System.out.println("TAST BLOT EXIT I BEGGE FELTER\n");
            System.out.println("************************************************");
            System.out.println("Felt 1: Tast filmens titel");
            this.movieTitle = scanner.nextLine();
            System.out.println("Felt 2: Skriv genren på filmen");
            this.genre = scanner.nextLine();
            System.out.println("Felt 3: Tast filmens pris");
            this.price = scanner.nextLine();
            System.out.println("Felt 4: tast længden på filmen");
            this.movieLength = scanner.nextLine();

            if (!movieTitle.equalsIgnoreCase("Exit") && !genre.equalsIgnoreCase("Exit") &&
                    !price.equalsIgnoreCase("Exit") && !movieLength.equalsIgnoreCase("Exit")) {




            } else {
                menu();
            }


        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
