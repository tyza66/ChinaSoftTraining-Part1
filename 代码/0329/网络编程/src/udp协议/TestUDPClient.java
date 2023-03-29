package udp协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TestUDPClient {
    public static void main(String[] args) throws IOException {
        //UDP协议编程的发送方
        DatagramSocket socket=new DatagramSocket();//构造快递站
        String str="hello!!! revicer.... I am sender.....";
        byte[] bytes = str.getBytes();//转换成字节数组，以字节数组的方式来传输
        //InetSocketAddress 相当于快递单 DatagramPacket 就相当于包裹
        //将快递打包，贴上快递单
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,new InetSocketAddress("localhost",8883));
        //投递快递
        socket.send(dp);
        //关闭资源
        if(socket!=null){
            socket.close();
        }
    }
}
