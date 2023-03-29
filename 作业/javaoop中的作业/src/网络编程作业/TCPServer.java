package 网络编程作业;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ServerSocket ss = new ServerSocket(8926);
        Socket accept = ss.accept();
        BufferedReader bf = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        PrintWriter pw = new PrintWriter(accept.getOutputStream());
        while (true){
            String message = bf.readLine();
            System.out.println("客户端："+message);
            if(message.equals("BYE")){
                pw.println("BYE");
                pw.flush();
                break;
            }else{
                String out = input.next();
                pw.println(out);
                pw.flush();
            }
        }
        if(bf!=null){
            bf.close();
        }
        if(pw!=null){
            pw.close();
        }
        if(accept!=null){
            accept.close();
        }
        if(ss!=null){
            ss.close();
        }
    }
}
