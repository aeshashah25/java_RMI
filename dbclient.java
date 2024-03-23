import java.net.InetAddress;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

public class dbclient {
    public static void main(String args[]) {
        try {
            String host = InetAddress.getLocalHost().getHostName();
            Registry registry = LocateRegistry.getRegistry(host, 2345);

            dbinter objinter = (dbinter) registry.lookup("CUSTOMER");

            List<Customer> list = objinter.getCustomers();
            for (Customer c : list) {
                System.out.println("Name: " + c.getName());
                System.out.println("Price: " + c.getPrice());
                System.out.println("Author: " + c.getAuthor());
                System.out.println("Quantity: " + c.getQuantity());
                System.out.println("Publication: " + c.getPublication());
                System.out.println("Date of Publication: " + c.getDatePublication());
                System.out.println("Quantity Order: " + c.getQuanOrder());
                System.out.println("Total Cost: " + c.getTotalCost());
                System.out.println(); // Add an empty line for better readability
            }
        } catch (Exception e) {
            System.out.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
