package udp协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestUDPRevicer {
    public static void main(String[] args) throws IOException {

        //接收数据
        DatagramSocket socket=new DatagramSocket(8874);
        byte[] bytes=new byte[50];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        socket.receive(dp);
        String str=new String(bytes);
        System.out.println("来自发送方的消息是："+str);

        //发送数据
        String str2="Hello sender!!! Are you OK? I am fine...";
        byte[] bytes2 = str2.getBytes();
        //getSocketAddress 获取发送者的ip地址和端口号
        DatagramPacket dp2=new DatagramPacket(bytes2,bytes2.length,dp.getSocketAddress());
        socket.send(dp2);

        //关闭资源
        if(socket!=null){
            socket.close();
        }
    }
}
