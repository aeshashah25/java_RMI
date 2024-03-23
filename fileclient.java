import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class fileclient {
    public static void main(String[] args) {
        try {
            // Get the RMI registry on localhost and port 2678
            Registry registry = LocateRegistry.getRegistry("localhost", 2678);

            // Lookup the remote object "FILE" in the registry
            fileinter remoteFile = (fileinter) registry.lookup("FILE");

            String filename = "run_rmi.txt";
            int position = 500;

            byte[] fileContent = remoteFile.read(filename, position);

            if (fileContent != null) {
                String contentString = new String(fileContent);
                System.out.println("File content at position " + position + ":\n" + contentString);
            } else {
                System.out.println("File content is null or position exceeds file size.");
            }
        } catch (Exception e) {
            System.err.println("Error communicating with File Server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
