package View;

import Controller.Admin;
import Controller.CreateMovie;
import Controller.EditMovie;

import java.util.Scanner;

public class Menu {

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
                System.out.println("Plads bookning");
                System.out.println("Se bookning/kalender");
                System.out.println("Rediger bookning");
                switch (chooseOption()) {
                    case 1:
                        //Her kaldes noget med bookning
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


    public void bookingMenu() {

        System.out.println("Book:");
        System.out.println();
        System.out.println("1: Plads resevering");
        System.out.println("2: Se bookninger");
        System.out.println("3: Rediger bookning");
        System.out.println();
        System.out.println("0: Tilbage");
    }

    private String convertSeatsRange(int seatFrom, int seatTo) {

        String returnString = "";

        for (int i = seatFrom; i <= seatTo; i++) {

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

    private static int chooseOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
