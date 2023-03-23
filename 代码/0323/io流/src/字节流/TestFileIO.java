package 字节流;

import java.io.*;

public class TestFileIO {

    public static void main(String[] args) {

        //testWrite();
        try {
            testRead();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testWrite() {
        //字节流不能处理中文问题，中文会出现乱码
        //1. 构建基本输入输出流的通道
        OutputStream out=null;
        try {
            out = new FileOutputStream("D:\\中软103\\代码\\0323\\1.txt");

            //2. 读取或者写入数据
            out.write('a');
            out.write('b');
            out.write('5');
            out.write('*');
            //out.write('你');
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //3.关闭流
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void testRead() throws IOException {
        //1. 构建基本的输入输出流的通道
        InputStream in=new FileInputStream("D:\\中软103\\代码\\0323\\1.txt");
        //2. 读取或者写入数据
        int one = in.read();
        int two = in.read();
        int three = in.read();
        int four = in.read();

        System.out.println((char)one+" "+(char)two+" "+(char)three+" "+(char)four);

        in.close();

    }
}
