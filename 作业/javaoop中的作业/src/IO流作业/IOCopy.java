package IO流作业;

import java.io.*;

public class IOCopy {
    public static void main(String[] args) {
        try {
            //整个读出来的方式
            FileInputStream fis = new FileInputStream("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\IO流作业\\giao.txt");
            byte[] a = new byte[64];
            fis.read(a);
            //System.out.println(new String(a));
            FileOutputStream out = new FileOutputStream("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\IO流作业\\giao2.txt");
            out.write(a);
            FileOutputStream out2 = new FileOutputStream("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\IO流作业\\giao3.txt",true);
            //边读边写的方式
            fis = new FileInputStream("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\IO流作业\\giao.txt");
            int data=0;
            while((data=fis.read())!=-1){
                out2.write((char)data);
            }
            fis.close();
            out.close();
            out2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
