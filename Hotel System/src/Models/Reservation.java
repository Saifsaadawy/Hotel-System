package Models;

public class Reservation { 
    private int customerId; 
    private int roomNumber; 
    private String checkIn; 
    private String checkOut; 
    private double totalBill; 
    public Reservation(int customerId, int roomNumber, String checkIn, String checkOut, double totalBill) { 
        this.customerId = customerId; 
        this.roomNumber = roomNumber; 
        this.checkIn = checkIn; 
        this.checkOut = checkOut; 
        this.totalBill = totalBill; 
  
} // Getters and Setters }

