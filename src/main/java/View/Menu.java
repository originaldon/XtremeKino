package View;

import Controller.Booking;
import Controller.CreateMovie;
import Controller.EditMovie;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Menu.menu();
    }

    public static void menu() {
        boolean quit = false;
        System.out.println("Menu:");
        System.out.println();
        System.out.println("1: Book");
        System.out.println("2: Salg");
        System.out.println("3: Film");
        System.out.println("4: Luk");

        switch (chooseOption()) {
            case 1: {
                System.out.println("1: Plads bookning");
                System.out.println("2: Se bookning/kalender");

                System.out.println("3: Rediger booking");
                System.out.println("4: Slet bookning");
              System.out.println("5: Vend tilbage til menuen");

                switch (chooseOption()) {
                    case 1:
                        Booking.reserveSeats();
                        Menu.menu();
                        break;
                    case 2:
                        //Print bookninger eller kalender
                        Booking.findBooking();
                        Menu.menu();
                        break;
                    case 3:
                        Booking.editBookings();
                        Menu.menu();
                        break;
                    case 4:
                        Booking.deleteBooking();
                        Menu.menu();
                        break;
                  case 5:
                    Menu.menu();

                        break;
                    default:
                        System.out.println("Vælg et menupunkt");
                        Menu.menu();
                        break;
                }
                break;
            }
            case 2: {
                System.out.println("1: Betal for bookning");
                System.out.println("2: Salgs statistik");
                System.out.println("3: Vend tilbage til menuen");
                switch (chooseOption()) {
                    case 1:
                        //Kald betalingsmetode
                        Menu.menu();
                        break;
                    case 2:
                        //Print statistik over salg
                        Menu.menu();
                        break;
                    case 3:
                        Menu.menu();
                        break;
                    default:
                        System.out.println("Vælg et menupunkt");
                        Menu.menu();
                        break;
                }
                break;
            }
            case 3: {
                System.out.println("1: Indsæt ny film");
                System.out.println("2: Rediger film");
                System.out.println("3: Vend tilbage til menuen");
                switch (chooseOption()) {
                    case 1:
                        CreateMovie.createMovies();
                        Menu.menu();
                        break;
                    case 2:
                        EditMovie.editMovie();
                        Menu.menu();
                        break;
                    case 3:
                        Menu.menu();
                        break;
                    default:
                        System.out.println("Vælg et menupunkt");
                        Menu.menu();
                        break;
                }
                break;
            }
            case 4:
                quit = true;
                break;
            default:
                System.out.println("Vælg et menupunkt");
                Menu.menu();
                break;
        }
        if (quit) {
            System.out.println("Farvel og tak for i dag.");
            System.exit(1);
        }
    }

    private static int chooseOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

