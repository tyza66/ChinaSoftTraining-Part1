import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReadAndWrite {
    public static void main(String[] args) {
        try {
            testWriter();
            testReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testWriter() throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\练习\\IDEAWorkSpace\\FileReader\\giao.txt",true);
        fileWriter.write("你好");
        fileWriter.close();
    }

    public static void testReader() throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\练习\\IDEAWorkSpace\\FileReader\\giao.txt");
        int i = 0;
        while((i=fileReader.read())!=-1){
            System.out.print((char)i);
        }
        fileReader.close();
    }
}
