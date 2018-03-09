/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xp_kino;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Nugzar
 */
public class Booking_Database {

    DatabaseDao conn = new DatabaseDao();

    private static final String INSERT_BOOKING = "INSERT INTO KinoXP.booking(phone, name, movie, hall, seats) VALUES(?, ?,?,?,?)";//phone, name, movie, hall, seats
//    private static final String UPDATE_BOOKING = "UPDATE KinoXP.booking SET phone=?, name=?, movie=?, hall=?, seats=?;";
    private static final String DELETE_BY_ID = "DELETE FROM KinoXP.booking WHERE idbooking=?";

    public void createBooking(String phone, String name, String movie, String hall, String seats) {

        try {
            PreparedStatement stmt = null;
            stmt = conn.get().prepareStatement(INSERT_BOOKING);
            stmt.setString(1, phone);
            stmt.setString(2, name);
            stmt.setString(3, movie);
            stmt.setString(4, hall);
            stmt.setString(5, seats);
            stmt.execute();

        } catch (SQLException e) {

        }

    }

//    public void updateBooking(int phone, String name, String movie, String hall, String seats) {
//
//        try {
//            PreparedStatement stmt = null;
//            stmt = conn.get().prepareStatement(UPDATE_BOOKING);
//            stmt.setInt(1, phone);
//            stmt.setString(2, name);
//            stmt.setString(3, movie);
//            stmt.setString(4, hall);
//            stmt.setString(5, seats);
//            stmt.executeUpdate();
//        } catch (SQLException e) {
//
//        }
//
//    }

    public void deleteProduct(int bookingID) {
        try {
            PreparedStatement stmt = null;
            stmt = conn.get().prepareStatement("DELETE FROM booking WHERE idbooking='" + bookingID + "'");
            stmt.executeUpdate();
        } catch (SQLException e) {

        }
    }

}
