package tcp协议;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket accept = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String s = br.readLine();
        System.out.println("来自客户端:"+s);
        if(br!=null){
            br.close();
        }
        if (accept!=null){
            accept.close();
        }
    }
}
