
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    

    public static void main(String[] args) {
        try {
            System.out.println("Waiting for Client");
            ServerSocket ss = new ServerSocket(7896);
            Socket soc = ss.accept();
            System.out.println("Connection established Sucessful");

            ss.close();
            soc.close();

        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
    }

    
}
