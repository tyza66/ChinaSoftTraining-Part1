package tcp协议;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) throws IOException {
        //发送消息的一方
        //1. 建立连接  Socket 套接字 网络通讯的客户段的端口
        //端口号 默认0-565535之间，0-1024之间不要选，已经被系统占用了
        //表示本机ip有几种方式： 1，实际ip 2. localhost  3.127.0.0.1
        Socket client=new Socket("192.168.13.100",8888);
        //2. 传输数据
        PrintWriter pw=new PrintWriter(client.getOutputStream());
        pw.println("hello server!!!");
        pw.flush();//刷新流
        //3.关闭链接

        if(pw!=null){
            pw.close();
        }
        if(client!=null){
            client.close();
        }
    }
}
