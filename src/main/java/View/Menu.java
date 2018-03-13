package View;

import Controller.Booking;
import Controller.CreateMovie;
import Controller.EditMovie;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args){
        Menu.menu();
    }

    public static void menu() {
        boolean quit = false;
        System.out.println("Menu:");
        System.out.println();
        System.out.println("1: Book");
        System.out.println("2: Salg");
        System.out.println("3: Film");
        System.out.println("0: Luk");

        switch (chooseOption()) {
            case 1: {
                System.out.println("1: Plads bookning");
                System.out.println("2: Se bookning/kalender");
                System.out.println("3: Rediger bookning");
                switch (chooseOption()) {
                    case 1:
                        Booking.reserveSeats();
                        break;
                    case 2:
                        //Print bookninger eller kalender
                        break;
                    case 3:
                        //Kald rediger bookning
                        break;
                    default:
                        System.out.println("Vælg et menupunkt");
                        break;
                }
                break;
            }
            case 2: {
                System.out.println("Betal for bookning");
                System.out.println("Salgs statistik");
                switch (chooseOption()) {
                    case 1:
                        //Kald betalingsmetode
                        break;
                    case 2:
                        //Print statistik over salg
                        break;
                    default:
                        System.out.println("Vælg et menupunkt");
                        break;
                }
                break;
            }
            case 3: {
                System.out.println("Indsæt ny film");
                System.out.println("Rediger film");
                switch (chooseOption()) {
                    case 1:
                        CreateMovie.createMovies();
                        break;
                    case 2:
                        EditMovie.editMovie();
                        break;
                    default:
                        System.out.println("Vælg et menupunkt");
                        break;
                }
                break;
            }
            case 4:
                quit = true;
                break;
            default:
                System.out.println("Vælg et menupunkt");
                break;
        }
        while (quit) {
            System.out.println("Farvel og tak for i dag.");
        }
    }


//    public void bookingMenu() {
//
//        System.out.println("Book:");
//        System.out.println();
//        System.out.println("1: Plads resevering");
//        System.out.println("2: Se bookninger");
//        System.out.println("3: Rediger bookning");
//        System.out.println();
//        System.out.println("0: Tilbage");
//}

    private static int chooseOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

