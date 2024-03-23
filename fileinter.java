import java.rmi.Remote;
import java.rmi.RemoteException;

public interface fileinter extends Remote {
    byte[] read(String filename, int position) throws RemoteException;
}
