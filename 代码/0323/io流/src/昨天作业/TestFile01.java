package 昨天作业;

import java.io.File;

public class TestFile01 {
    public static void main(String[] args) {

        File file=new File("D:\\中软103\\代码\\0322");
        listFile(file);
    }

    public static void listFile(File f){
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for(File file:files){
                //不管是文件或目录全部都递归掉头
                listFile(file);
            }

        }else{
            if(f.getName().endsWith(".java")){
                //判断是否是java文件
                System.out.println(f.getName());
            }
        }
    }
}
