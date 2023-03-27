package 作业2;

import java.io.File;
import java.io.IOException;

public class Zy2 {
    public static void main(String[] args) {
        // 使用绝对路径，在D盘创建一个testIO文件夹，然后再testIO文件中创建一个1.txt文件中；
        // 使用相对路径，在当前项目下创建一个testIO文件夹，然后再testIO文件中创建一个2.txt文件中

        //先判断创建父目录，再判断创建文件
       // File file1 = new File("D://testIO//1.txt");
        File file1 = new File("src//testIO//1.txt");

        File parentFile = file1.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


