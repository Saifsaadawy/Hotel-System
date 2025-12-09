package Models;
public class Room {
     private int roomNumber; 
     private String roomType; 
     private double price; 
     private boolean isBusy; 
     private String serviceName; 
     public Room(int roomNumber, String roomType, double price, boolean isBusy, String serviceName) { 
        this.roomNumber = roomNumber; 
        this.roomType = roomType; 
        this.price = price; 
        this.isBusy = isBusy; 
        this.serviceName = serviceName;
    } 

} // Getters and Setters }
