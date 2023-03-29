package tcp协议;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1",8888);
        PrintWriter pw = new PrintWriter(client.getOutputStream());
        pw.println("Hello,World!");
        if(pw!=null){
            pw.close();
        }
        if(client!=null){
            client.close();
        }
    }
}
