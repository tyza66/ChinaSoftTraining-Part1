package 昨天作业;

import java.io.File;

public class TestFile02 {
    public static void main(String[] args) {

        File02 f=new File02();
        File file=new File("D:\\中软103\\代码\\0322");
        f.readFile(file);
        f.show();

    }
}

class File02{

    int javaCount=0;
    int dirCount=0;

    public void readFile(File f){
        if(f.isDirectory()){
            //判断是否是目录
            File[] files = f.listFiles();
            if(files!=null&& files.length>0){//数组的非空判断
                for(File file:files){
                    if(file.isDirectory()){
                        dirCount++;
                    }
                    readFile(file);
                }

            }

        }else{
            //如果是文件
            System.out.println(f);
            //判断是否是java文件
            if(f.getName().endsWith(".java")){
                javaCount++;
            }

        }
    }

    public void show(){
        System.out.println("java文件有："+javaCount);
        System.out.println("目录一共有："+dirCount);
    }
}