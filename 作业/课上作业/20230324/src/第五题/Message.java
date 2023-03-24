package 第五题;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Message implements Serializable {
    String sender;
    String receiver;
    String message;
    Date sendTime;

    public Message() {
    }

    public Message(String sender, String receiver, String message, Date sendTime) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.sendTime = sendTime;
    }

    public void show(){
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("时间："+sd.format(sendTime));
        System.out.println("发送人："+sender);
        System.out.println("接收人："+receiver);
        System.out.println("消息内容："+message);
    }
}
