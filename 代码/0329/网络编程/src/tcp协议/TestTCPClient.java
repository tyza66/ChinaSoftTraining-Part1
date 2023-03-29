package tcp协议;

import sun.nio.cs.ext.ISO2022_CN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class TestTCPClient {

    public static void main(String[] args) throws IOException {
        //客户端先向服务器发送一个消息，再接受来自服务器的消息
        Socket client=new Socket("localhost",8889);
        //先服务器发送消息
        PrintWriter pw=new PrintWriter(client.getOutputStream());
        pw.println("How Are you!!!Server...");
        pw.flush();

        //接受来自服务器段的消息
        BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
        String str = br.readLine();
        System.out.println("来自服务器的消息是："+str);

        //关闭资源
        if(pw!=null){
            pw.close();
        }
        if(br!=null){
            br.close();
        }
        if(client!=null){
            client.close();
        }
    }
}
