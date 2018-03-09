package View;

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
        while (quit){
            System.out.println("Farvel og tak for i dag.");
        }
    }

    private static int chooseOption() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
