package udp协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TestUDPServer {
    public static void main(String[] args) throws IOException {

        //构造一个服务端的快递站，指明那个快递站，带端口的
        DatagramSocket socket=new DatagramSocket(8883);
        //构造一个快递包，用于存储接受过来的数据
        byte[] bytes=new byte[100];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        //接受数据
        socket.receive(dp);
        //将快递包里面的数据转换成String类型
        String str=new String(bytes);
        System.out.println("来自发送方的消息是："+str);

        //关闭资源
        if(socket!=null){
            socket.close();
        }

    }
}
