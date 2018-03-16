package Controller;

import View.Menu;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Booking {
    public static void reserveSeats() {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        System.out.println();

        //Sal - tlfnr - sæde - række
        System.out.println();
        System.out.print("Indtast tlfnr: ");
        String phone = scanner.nextLine();
        System.out.print("Indtast navn: ");
        String name = scanner.nextLine();
        System.out.println("Indtast film: ");
        String movie = scanner.nextLine();
        System.out.print("Indtast sal: ");
        String hall = scanner.nextLine();
        System.out.print("Indtast række: ");
        String row = scanner.nextLine();
        System.out.print("Indtast startsæde: ");
        int seatFrom = scanner.nextInt();
        System.out.print("Indtast slutsæde: ");
        int seatTo = scanner.nextInt();

        admin.createBooking(phone, name, movie, hall, row, convertSeatsRange(seatFrom, seatTo));
    }

    public static void deleteBooking(){

        Admin admin = new Admin();

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Indtast id på booking:");
        String idbooking = scanner.nextLine();

        if (admin.deleteBooking(idbooking)){
            System.out.println("Booking slettet");
            Menu.menu();
        }else{
            System.out.println("booking ID ikke fundet");
            Menu.menu();
        }


    }

    public static void findBooking(){

        Admin admin = new Admin();

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Indtast tlf. på kunde:");
        String phone = scanner.nextLine();
        List<String[]> foundBookings = admin.findBooking(phone);
        if (foundBookings != null){
            System.out.println(Arrays.toString(foundBookings.get(0)));
        }else{
            System.out.println("Tlf. ikke fundet.");
            Menu.menu();
        }
    }

    public static void editBookings(){

        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("indtast booking ID på booking du vil redigere:");
        String idbooking = scanner.nextLine();
        admin.deleteBooking(idbooking);
        Booking.reserveSeats();
        Menu.menu();


    }

    private static String convertSeatsRange(int seatFrom, int seatTo) {

        String returnString = "";

        for (int i = seatFrom; i <= seatTo; i++) {

            returnString += i + " ";
        }

        return returnString;
    }
}
