import java.rmi.Naming;

public class three_osclient {
    public static void main(String[] args) {
        try {
            three_osint osint = (three_osint) Naming.lookup("OS");

            System.out.println("Operating System Version: " + osint.getOSVersion());
            System.out.println("Total Disk Space: " + osint.getTotalDiskSpace() + " bytes");
            System.out.println("Free Disk Space: " + osint.getFreeDiskSpace() + " bytes");
            System.out.println("Total Memory: " + osint.getTotalMemory() + " bytes");
            System.out.println("Used Memory: " + osint.getUsedMemory() + " bytes");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}