package tcp协议;

import javax.print.attribute.standard.PrinterInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ExClient {
    public static void main(String[] args) throws IOException {
        /*设服务器端程序监听端口为8629,当收到客户端信息后，首先判断是否是“BYE”，

        若是，则立即向对方发送“BYE”，然后关闭监听，结束程序。

        若不是，则在屏幕上输出收到的信息，并由键盘上输入发送到对方的应答信息。

        请编写程序完成此功能。
*/

        //先发送消息  再接受消息
        Socket s=new Socket("localhost",8629);
        Scanner sc=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line=null;
        while(!"bye".equalsIgnoreCase(line)){
            //客户端发送内容
            System.out.println("请发送内容：");
            String datas = sc.nextLine();
            pw.println(datas);
            pw.flush();

            //客户端接受数据
            line = br.readLine();
            System.out.println("接受到的消息是："+line);
        }

        if(br!=null){
            br.close();
        }
        if(pw!=null){
            pw.close();
        }
        if(s!=null){
            s.close();
        }
    }
}
