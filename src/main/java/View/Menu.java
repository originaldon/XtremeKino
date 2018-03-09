package View;

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
        System.out.println("1: Book");

    }

    private int chooseOption() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    private boolean testExit (String test){
        return test.equalsIgnoreCase("Exit")
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
}
