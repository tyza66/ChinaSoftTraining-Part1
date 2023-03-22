package 文件;

import java.io.File;

public class TestFile01 {
    public static void main(String[] args) {

        //File(String pathname)
        //window下的路径分隔符\\ 或者 /
        File file1=new File("D:\\中软103\\代码\\0322");//表示的是目录
        //File(String pathname)
        File file2=new File("D:\\中软103\\代码\\0322\\作业.txt");//表示的是物理文件
        //File(File parent, String child)
        File file3=new File(file1,"作业.txt");
        //File(String parent, String child)
        File file4=new File("D:\\中软103\\代码\\0322","作业.txt");

        //boolean canExecute()  是否能执行
        System.out.println("file1能执行？"+file1.canExecute());//true
        System.out.println("file2能执行？"+file2.canExecute());//true
        //boolean canRead()   是否可读
        System.out.println("file1可读？"+file1.canRead());//true
        System.out.println("file2可读？"+file2.canRead());//true
        //boolean canWrite()  是否能写
        System.out.println("file1可写？"+file1.canWrite());//true
        System.out.println("file2可写？"+file2.canWrite());//true

        //boolean exists()  是否存在
        System.out.println("file1存在？"+file1.exists());
        System.out.println("file2存在？"+file2.exists());

        //boolean isDirectory()  判断是否是目录
        System.out.println("f1是文件夹？"+file1.isDirectory()+" f2是文件夹？"+file2.isDirectory());//true false
        //boolean isFile()   判断是否是物理文件
        System.out.println("f1是文件？"+file1.isFile()+" f2是文件？"+file2.isFile());//false true

        //long length()  返回文件的长度
        long length=file2.length();
        System.out.println("文件大小是："+length);

        //String getPath()  获取此文件的路径名字符串
        String str1=file1.getPath();
        System.out.println("f1的路径字符串表示是："+str1);

        //String getName()   获取文件名，不包含路径名
        String str2=file2.getName();
        System.out.println("f2的文件名称是："+str2);






    }
}
