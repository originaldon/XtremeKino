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

        switch (chooseOption()){

        }
    }
    public void bookingMenu(){

        System.out.println("Book:");
        System.out.println();
        System.out.println("1: Book");

    }

    private int chooseOption(){

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
