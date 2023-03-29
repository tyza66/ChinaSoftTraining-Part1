package tcp协议;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TestTCPClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("192.168.201.21", 8889);

        PrintWriter pw = new PrintWriter(client.getOutputStream());
        pw.println("giao!giao!");
        pw.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String s = br.readLine();
        System.out.println("服务器回复的信息是：" + s);

        if (pw != null) {
            pw.close();
        }
        if (br != null) {
            br.close();
        }
        if (client != null) {
            client.close();
        }
    }
}
