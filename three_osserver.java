public class three_osserver {

    public static void main(String[] args) {
        try {
            three_osimp osimp = new three_osimp();
            java.rmi.registry.LocateRegistry.createRegistry(1254);
            java.rmi.Naming.rebind("OS", osimp);
            System.out.println("SystemInfoService bound and ready to serve.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}
