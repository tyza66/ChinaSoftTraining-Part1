package 网络编程作业;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //8926
        Socket client = new Socket("192.168.201.21", 8326);
        Scanner input = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(client.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String message = "";
        while (true) {
            message = input.next();
            pw.println(message);
            pw.flush();
            String s = br.readLine();
            System.out.println("服务端：" + s);
            if (message.equals("BYE")) {
                break;
            }
        }
        if (pw != null) {
            pw.close();
        }
        if(br!=null){
            br.close();
        }
        if (client != null) {
            client.close();
        }
    }
}
