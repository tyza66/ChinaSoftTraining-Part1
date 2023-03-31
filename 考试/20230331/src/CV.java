import java.io.*;

/**
 * Author: tyza66
 * CreateTime: 2023-03-31 15:21
 * Github: https://github.com/tyza66
 */
public class CV {
    public static void main(String[] args) throws IOException {
        File f1 = new File("src/1.jpg");
        File f2 = new File("src/2.jpg");
        FileInputStream fileInputStream = new FileInputStream(f1);
        FileOutputStream fileOutputStream = new FileOutputStream(f2);
        int temp = 0;
        while((temp = fileInputStream.read())!=-1){
            fileOutputStream.write(temp);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
