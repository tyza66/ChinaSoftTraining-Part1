package 字节流;

import java.io.*;

public class TestDataInOut {
    public static void main(String[] args) {

        try {
            testWrite();
            testRead();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //往文件里面写入基本数据类型
    public static void testWrite() throws IOException {

        DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\中软103\\代码\\0323\\3.txt"));

        //写入数据
        // byte short int long float double char boolean String
        dos.writeByte(12);
        dos.writeShort(13);
        dos.writeInt(23);
        dos.writeLong(234);
        dos.writeFloat(56.34f);
        dos.writeDouble(566.344);
        dos.writeChar('a');
        dos.writeBoolean(false);
        dos.writeUTF("helloworld");

        //关闭流
        dos.close();

    }
    //读取基本数据类型数据
    public static void testRead() throws IOException {
        DataInputStream dis=new DataInputStream(new FileInputStream("D:\\中软103\\代码\\0323\\3.txt"));

        //读取数据
        // byte short int long float double char boolean String
        //读取的顺序一定要和写入的顺序保持一致
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        char ch = dis.readChar();
        boolean bl = dis.readBoolean();
        String str = dis.readUTF();
        System.out.println(b+" "+s+" "+i+" "+l+" "+f+" "+d+" "+ch+" "+bl+" "+str);

        //关闭流
        dis.close();

    }
}
