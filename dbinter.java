import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface dbinter extends Remote {
  public  List<Customer> getCustomers() throws RemoteException;
}
