package 作业1;

import java.io.*;

public class TestCopy {

    public static void main(String[] args) {
        String src="D:\\中软103\\代码\\0324\\ascii.jpg";
        String tar="src\\aa.jpg";
        String tar2="src\\bb.jpg";
        try {
//            copy(src,tar);
            copy2(src,tar2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copy(String src,String tar) throws IOException {
        InputStream in=new FileInputStream(src);
        FileOutputStream out=new FileOutputStream(tar);

        int data=0;
        while((data=in.read())!=-1){
            out.write(data);
        }

        //关闭资源
        in.close();
        out.close();

    }
    public static void copy2(String src,String tar) throws IOException {
        InputStream in=new FileInputStream(src);
        FileOutputStream out=new FileOutputStream(tar);

        int data=0;
        byte[] bytes=new byte[1024];
        while((data=in.read(bytes))!=-1){
            out.write(bytes);
        }

        //关闭资源
        in.close();
        out.close();

    }
}
