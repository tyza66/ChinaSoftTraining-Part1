package 字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReadAndWrite {

    public static void main(String[] args) {

        try {
            //testRead();
            testWrite();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testRead() throws IOException {
        //字符流能够处理中文问题
        FileReader reader=new FileReader("D:\\中软103\\代码\\0323\\io流\\src\\驾驶员测试题\\FileUtil.java");

        //文件很多字符，通过循环来处理
        int data = 0;
        while((data=reader.read())!=-1){
            System.out.print((char)data);
        }

        //关闭流
        reader.close();
    }

    public static void testWrite() throws IOException {
        //构建流对象
        //后面参数true表示追加到文件末尾
        FileWriter writer=new FileWriter("D:\\中软103\\代码\\0324\\1.txt",true);

        //写入数据
        writer.write('!');
        writer.write("hello");
        writer.write('哎');
        writer.write("中软国际");
        //关闭流
        writer.close();
    }
}
