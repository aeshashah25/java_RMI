import java.rmi.*;
import java.net.*;
public class addserver {
    public static void main(String[] args) {
        try {
            addremimpl locObj = new addremimpl();
            String registryURL = "rmi:///addrem"; // Update IP address and port as needed
            Naming.rebind(registryURL, locObj);
            System.out.println("Server is running and bound to " + registryURL);
        } catch (RemoteException re) {
            System.err.println("RemoteException: " + re.getMessage());
            re.printStackTrace();
        } catch(MalformedURLException mfe){
                mfe.printStackTrace();
}
    }
}
