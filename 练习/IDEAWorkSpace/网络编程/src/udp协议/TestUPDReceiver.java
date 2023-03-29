package udp协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TestUPDReceiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8848);
        byte[] bytes = new byte[30];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);
        System.out.println("接收端接到："+new String(bytes));

        String m = "giao";
        byte[] bytes1 = m.getBytes();
        DatagramPacket dp2 = new DatagramPacket(bytes1,bytes1.length,dp.getSocketAddress());
        ds.send(dp2);
        if(ds!=null){
            ds.close();
        }

    }
}
