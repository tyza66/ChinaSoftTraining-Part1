package 字节流;

import java.io.*;

public class TestFileIO02 {
    public static void main(String[] args) {

        try {
            doRead();
            doWrite();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void doRead() throws IOException {
        //字节流，中文会出现乱码
        //1. 构建基本的输入输出流
        InputStream in=new FileInputStream("D:\\中软103\\ideaworkspace\\io流\\src\\字节流\\TestFileIO.java");
        //2. 读取或者写入数据
        //文件很大，不知道有多少个字节，通过循环实现
        int data=0;
        while((data=in.read())!=-1){
            System.out.print((char)data);
        }

        in.close();
    }

    public static void doWrite() throws IOException {
        //默认是覆盖，如果想最追加到文件末尾，而不是覆盖 追加到末尾，只需要构造方法末尾后面添一个参数true
        OutputStream out=new FileOutputStream("D:\\中软103\\代码\\0323\\2.txt",true);

        out.write('l');
        out.write('o');
        out.write('v');
        out.write('e');

        out.close();
    }
}
