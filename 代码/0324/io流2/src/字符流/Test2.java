package 字符流;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {

        try {
            //testRead();
            testWrite();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testRead() throws IOException {
        //带缓冲去的流 包装流，在其他流的基础之上增加了新的功能，有逐行读取的方法
        BufferedReader br=new BufferedReader(new FileReader("src\\字符流\\TestReadAndWrite.java"));

        String line=null;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
    }

    public static void testWrite() throws FileNotFoundException {
        PrintWriter pw=new PrintWriter("D:\\中软103\\代码\\0324\\2.txt");

        pw.println(false);
        pw.println(23.45f);
        pw.println("共产党的粗大今年房价弄就弄");
        pw.println(564655);
        pw.println("645764576hggghghu^%^&&^");

        //关闭流
        pw.close();
    }
}
