package tcp协议;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestTCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8889);
        System.out.println(1);
        Socket accept = ss.accept();
        System.out.println(2);
        BufferedReader bf = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        System.out.println(3);
        String s = bf.readLine();
        System.out.println(4);
        System.out.println("ip:"+accept.getInetAddress()+",端口:"+accept.getPort());
        System.out.println("接收的信息是："+s);
        PrintWriter pw = new PrintWriter(accept.getOutputStream());
        pw.println("giao!");
        pw.flush();

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
