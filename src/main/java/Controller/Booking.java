package Controller;

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

    private static String convertSeatsRange(int seatFrom, int seatTo) {

        String returnString = "";

        for (int i = seatFrom; i <= seatTo; i++) {

            returnString += i + " ";
        }

        return returnString;
    }
}
