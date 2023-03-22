package 递归;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {

        File file=new File("D:\\中软103\\代码\\0322");
        lieju(file);
    }

    public static void lieju(File file){
        if(file.isDirectory()){//判断是否是目录

            File[] files = file.listFiles();
            for(File f :files){
                lieju(f);
            }
        }else{
            System.out.println(file);
        }
    }
}
