import java.net.*;

class n005 {
    public static void main(String args[]) {
        try {
            InetAddress address = InetAddress.getByName("www.sanook.com");
            System.out.println(address);
        } catch (Exception e) {
            System.out.println("ERROr");
            
        }

    }
}