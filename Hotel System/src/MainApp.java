import javax.swing.*; 
public class MainApp { 
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Hotel Reservation System"); 
        JTabbedPane tabs = new JTabbedPane(); 
        
        tabs.addTab("Employees", new EmployeePanel()); 
        tabs.addTab("Customers", new CustomerPanel()); 
        tabs.addTab("Rooms", new RoomPanel()); 
        tabs.addTab("Services", new ServicePanel()); 
        tabs.addTab("Reservations", new ReservationPanel()); 
        
        frame.add(tabs); frame.setSize(700, 500); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true); 

    }

}

