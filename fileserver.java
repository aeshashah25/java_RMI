import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class fileserver{
public static void main(String args[]){
 try {
            fileimpl implobj = new fileimpl();
             Registry registry=LocateRegistry.createRegistry(2678);
		registry.rebind("FILE",implobj);
			System.out.println("server started");

        } catch (Exception e) {
            System.err.println("Error startsing FileServer: " + e.getMessage());
            e.printStackTrace();
        }

}
}