
import java.net.Socket;

public class EchoClient {

    public static void main(String[] args) {
        try {
            System.out.println("Client Started");
            Socket soc = new Socket("localhost", 7896);
            System.out.println("Connected to Server");

            soc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
