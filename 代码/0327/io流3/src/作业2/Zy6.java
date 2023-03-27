package 作业2;

import java.io.*;

public class Zy6 {

    public static void main(String[] args) throws IOException {


        Reader r=new InputStreamReader(new FileInputStream("data/1.txt"),"utf-8");
        //OutputStream out=new FileOutputStream("data/2.txt");
        PrintWriter pw=new PrintWriter(new FileWriter("data/3.txt"));

        int data=0;
        while((data=r.read())!=-1){
            System.out.print((char) data);
            //out.write((char)data);
            pw.print((char) data);
        }

        //关闭资源
        r.close();
        pw.close();
    }
}
