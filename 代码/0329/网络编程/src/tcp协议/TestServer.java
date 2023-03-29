package tcp协议;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {

        //1,监听连接
        ServerSocket server=new ServerSocket(8888);
        //2. 接受并建立连接
        Socket s = server.accept();
        //3. 交换数据
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line = br.readLine();
        System.out.println("来自客户端的消息是："+line);

        //关闭连接
        if(br!=null){
            br.close();
        }
        if(s!=null){
            s.close();
        }
    }
}
