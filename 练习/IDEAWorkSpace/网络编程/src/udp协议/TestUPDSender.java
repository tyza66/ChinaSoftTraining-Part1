package udp协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TestUPDSender {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String m = "giaogiao";
        byte[] bytes = m.getBytes();
        DatagramPacket dp =  new DatagramPacket(bytes,bytes.length,new InetSocketAddress("127.0.0.1",8848));
        ds.send(dp);

        byte[] buffer = new byte[30];
        DatagramPacket dp2 = new DatagramPacket(buffer,buffer.length);
        ds.receive(dp2);
        System.out.println("接收端收到："+new String(buffer));

        if(ds!=null){
            ds.close();
        }
    }
}
