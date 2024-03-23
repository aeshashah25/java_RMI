import java.rmi.Remote;
import java.rmi.RemoteException;

public interface three_osint extends Remote {
    String getOSVersion() throws RemoteException;

    long getTotalDiskSpace() throws RemoteException;

    long getFreeDiskSpace() throws RemoteException;

    long getTotalMemory() throws RemoteException;

    long getUsedMemory() throws RemoteException;
}