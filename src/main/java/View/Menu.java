package View;

import Controller.Admin;
import Model.Database;

import java.util.Scanner;

public class Menu {

    public void menu() {

        System.out.println("Menu:");
        System.out.println();
        System.out.println("1: Book");
        System.out.println("2: Salg");
        System.out.println("3: Film");
        System.out.println("4: Varer");
        System.out.println("5: Kalender");
        System.out.println("6: Statistik");
        System.out.println();
        System.out.println("0: Luk");

        switch (chooseOption()) {

        }
    }

    public void bookingMenu() {

        System.out.println("Book:");
        System.out.println();
        System.out.println("1: Plads resevering");
        System.out.println("2: Se bookninger");
        System.out.println("3: Rediger bookning");
        System.out.println();
        System.out.println("0: Tilbage");
    }

    private String convertSeatsRange(int seatFrom, int seatTo){

        String returnString = "";

        for (int i = seatFrom; i <= seatTo; i++){

            returnString += i + " ";
        }

        return returnString;
    }

    public void reserveSeats() {

        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        System.out.println();


        //Sal - tlfnr - sæde - række
        System.out.println();
        System.out.print("Indtast tlfnr: ");
        String phone = scanner.nextLine();
        System.out.print("Indtast navn: ");
        String name = scanner.nextLine();
        System.out.print("Indtast sal: ");
        String venue = scanner.nextLine();
        System.out.print("Indtast række: ");
        String row = scanner.nextLine();
        System.out.print("Indtast startsæde: ");
        String seatFrom = scanner.nextLine();
        System.out.print("Indtast slutsæde: ");
        String seatTo = scanner.nextLine();

        admin.createBooking(venue, phone, row, convertSeatsRange(Integer.getInteger(seatFrom), Integer.getInteger(seatTo)));

    }


    private int chooseOption() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    private boolean testExit (String test){
        return test.equalsIgnoreCase("Exit");
    }

    public void createMovies() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("DU KAN TIL ENHVER TID VENDE TILBAGE TIL MENUEN");
        System.out.println("TAST BLOT EXIT I BEGGE FELTER\n");
        System.out.println("************************************************");
        System.out.println("Felt 1: Tast filmens titel");
        String movieTitle = scanner.nextLine();
        if (testExit(movieTitle)){ menu(); }
        System.out.println("Felt 2: Skriv genren på filmen");
        String genre = scanner.nextLine();
        if (testExit(genre)){ menu(); }
        System.out.println("Felt 3: Tast filmens pris");
        String price = scanner.nextLine();
        if (testExit(price)){ menu(); }
        System.out.println("Felt 4: tast længden på filmen");
        String movieLength = scanner.nextLine();
        if (testExit(movieLength)){ menu(); }


        menu();
    }
}
