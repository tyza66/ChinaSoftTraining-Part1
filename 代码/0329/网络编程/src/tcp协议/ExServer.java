package tcp协议;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ExServer {
    public static void main(String[] args) throws IOException {

        ServerSocket ss=new ServerSocket(8629);
        Socket s = ss.accept();//获取服务器段的套接字

        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw=new PrintWriter(s.getOutputStream());

        String line=null;
        while (!"bye".equalsIgnoreCase(line) ){
            //先接受数据
            line=br.readLine();
            System.out.println("来自客户端的消息是："+line);
            //再发送数据
            System.out.println("请服务器发送内容：");
            String datas = sc.nextLine();
            pw.println(datas);
            pw.flush();
        }
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
