//serrverside

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;


public class dbserver {
 	public static void main(String args[]){
	try{
	dbimpl obj = new dbimpl();
	Registry registry=LocateRegistry.createRegistry(2345);
	registry.rebind("CUSTOMER", obj);
	System.out.println("server started...");
	}
	catch(Exception e){
		System.out.println("Server exception"+e.toString());

	}
}
}