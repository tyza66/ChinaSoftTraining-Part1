package IO流作业;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\IO流作业\\giao.txt");
            int a = fis.read();
            int b = fis.read();
            fis.read();
            int c = fis.read();
            System.out.println((char)a);
            System.out.println((char)b);
            System.out.println(c);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
