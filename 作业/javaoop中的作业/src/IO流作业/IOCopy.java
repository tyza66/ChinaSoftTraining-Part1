package IO流作业;

import java.io.*;

public class IOCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\IO流作业\\giao.txt");
            byte[] a = new byte[64];
            fis.read(a);
            //System.out.println(new String(a));
            FileOutputStream out = new FileOutputStream("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\IO流作业\\giao2.txt");
            out.write(a);
            FileOutputStream out2 = new FileOutputStream("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\IO流作业\\giao3.txt",true);
            fis = new FileInputStream("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\IO流作业\\giao.txt");
            int data=0;
            while((data=fis.read())!=-1){
                out2.write((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
