package udp协议;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String message = "giao";
        byte[] buffer = message.getBytes();
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length, new InetSocketAddress("localhost", 8889));
        datagramSocket.send(dp);
        if (datagramSocket != null) {
            datagramSocket.close();
        }
    }
}
