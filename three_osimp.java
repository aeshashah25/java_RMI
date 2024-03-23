import java.io.File;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class three_osimp extends UnicastRemoteObject implements three_osint {
    protected three_osimp() throws RemoteException {
        super();
    }

    @Override
    public String getOSVersion() throws RemoteException {
        return System.getProperty("os.version");
    }

    @Override
    public long getTotalDiskSpace() throws RemoteException {
        return new File("/").getTotalSpace();
    }

    @Override
    public long getFreeDiskSpace() throws RemoteException {
        return new File("/").getFreeSpace();
    }

    @Override
    public long getTotalMemory() throws RemoteException {
        return Runtime.getRuntime().totalMemory();
    }

    @Override
    public long getUsedMemory() throws RemoteException {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
}
