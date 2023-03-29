package tcp协议;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestTCPServer {
    public static void main(String[] args) throws IOException {

        ServerSocket server=new ServerSocket(8889);
        Socket s = server.accept();

        //接受来自客户端消息
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str=br.readLine();
        System.out.println("来自客户端的消息是："+str);
        System.out.println("客户端的ip地址："+s.getInetAddress()+" 端口号："+s.getPort());

        //向客户端回消息
        PrintWriter  pw=new PrintWriter(s.getOutputStream());
        pw.println("I am fine!! Thank You,client.....");
        pw.flush();

        //关闭资源
        if(br!=null){
            br.close();
        }
        if(pw!=null){
            pw.close();
        }
        if(s!=null){
            s.close();
        }

    }
}
