package 第五题;

import java.io.*;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        String path = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\课上作业\\20230324\\Data\\message.data";
        Message message = new Message("小明", "小亮", "giao", new Date());
        try {
            write(path, message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Message m = null;
        try {
            m = read(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        m.show();
    }

    public static void write(String path, Message m) throws IOException {
        File f = new File(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(f));
        objectOutputStream.writeObject(m);
        objectOutputStream.close();

    }

    public static Message read(String path) throws IOException, ClassNotFoundException {
        File f = new File(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(f));
        Message m = (Message) objectInputStream.readObject();
        objectInputStream.close();
        return m;
    }
}
