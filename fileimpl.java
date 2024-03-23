import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class fileimpl extends UnicastRemoteObject implements fileinter {
    protected fileimpl() throws RemoteException {
        super();
    }

@Override
public byte[] read(String filename, int position) throws RemoteException {
    try (FileInputStream fis = new FileInputStream(filename);
         BufferedInputStream bis = new BufferedInputStream(fis)) {

        long fileSize = fis.available();  // Get the total file size
        byte[] fileContent = new byte[(int) fileSize];
        int bytesRead = bis.read(fileContent);
        if (bytesRead == -1) {
            System.out.println("Error reading file. Returned content is null.");
            return null;
        }

        return fileContent;
    } catch (Exception e) {
        System.err.println("Error reading file: " + e.getMessage());
        e.printStackTrace();
        return null;
    }
}

   } 