package 作业5;

import jdk.nashorn.internal.ir.visitor.SimpleNodeVisitor;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMessage {

    public static void main(String[] args) {

        //获取系统当前时间
        try {
           // testWrite();
            testRead();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void testWrite() throws IOException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String data = sdf.format(date);
        Message msg1 = new Message("123", "23454", "233445", data);
        Message msg2 = new Message("bbb", "dfdf", "fbbf", data);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("message.data"));
        oos.writeObject(msg1);
        oos.writeObject(msg2);

        oos.close();
    }

    public static void testRead() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("message.data"));
        Message msg1 = (Message) ois.readObject();
        Message msg2 = (Message) ois.readObject();

        System.out.println(msg1);
        System.out.println(msg2);

        ois.close();

    }
}

