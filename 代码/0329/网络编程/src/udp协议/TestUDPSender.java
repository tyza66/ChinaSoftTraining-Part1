package udp协议;

import java.io.IOException;
import java.net.*;

public class TestUDPSender {
    public static void main(String[] args) throws IOException {

        //发送消息
        DatagramSocket socket=new DatagramSocket();
        String str="Hello!!! Receiver... I am sender";
        byte[] bytes = str.getBytes();
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,new InetSocketAddress("localhost",8874));
        socket.send(dp);


        //接受消息
        byte[] bytes2=new byte[50];
        DatagramPacket dp2=new DatagramPacket(bytes2,bytes2.length);
        socket.receive(dp2);
        String str2=new String(bytes2);
        System.out.println("来自接收方的消息是："+str2);

        //关闭资源
        if(socket!=null){
            socket.close();
        }
    }
}
