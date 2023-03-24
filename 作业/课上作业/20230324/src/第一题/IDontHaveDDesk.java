package 第一题;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IDontHaveDDesk {
    //我没D盘 所以在C盘创建
    public static void main(String[] args) throws IOException {
        //创建目录
        File file = new File("C:\\testIO");
        if (!file.exists()) {
            file.mkdir();
        }
        //创建文件
        File file1 = new File("C:\\testIO\\1.txt");
        file1.createNewFile();
        File file2 = new File("src\\testIO");
        if (!file2.exists()) {
            System.out.println("创建");
            file2.mkdir();
        }
        File file3 = new File("src\\testIO\\2.txt");
        file3.createNewFile();
    }
}
