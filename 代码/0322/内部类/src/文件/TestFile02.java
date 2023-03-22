package 文件;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile02 {

    public static void main(String[] args) {

        //使用相对路径表示文件
        File file1=new File("src\\内部类\\Test1.java");
        //boolean exists()   判断文件是否存在
        System.out.println("文件存在？"+file1.exists());//true

        //boolean isAbsolute()  判断是否是绝对路径
        System.out.println("文件是绝对路径？"+file1.isAbsolute());//false

        //String getParent()  返回抽象路径名的父路径
        String parentPath=file1.getParent();
        System.out.println("当前的父路径是："+parentPath);

        //File getParentFile()  获取父路径的File表现形式


        //String getAbsolutePath()   返回绝对路径的String表现形式
        String absolutePath = file1.getAbsolutePath();
        System.out.println("绝对路径是："+absolutePath);

        //File getAbsoluteFile()  返回绝对路径的File表现形式
        File absoluteFile = file1.getAbsoluteFile();
        System.out.println("绝对路径是："+absoluteFile.getPath());

        //boolean createNewFile()   创建一个新文件
        File file2=new File("D:\\中软103\\代码\\0322\\aa.txt");
        try {
            boolean newFile = file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //static File createTempFile(String prefix, String suffix, File directory)  再指定目录中创建新文件

        File file3=new File("D:\\中软103\\代码\\0322");
        try {
            File.createTempFile("bhdfhfdhb",".txt",file3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //boolean delete()   删除文件或空的目录
       // file3.delete();
        //file2.delete();

        //long lastModified()   获取最后修改时间
        long l = file1.lastModified();
        //吧long类型的时间转变成能看懂的时间
        Date date=new Date(l);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String time = sdf.format(date);
        System.out.println("最后修改时间是："+time);

        File file4=new File("D:\\中软103\\代码\\0322\\aa\\bb\\cc");
        //mkdir()  创建指定的目录,前提是父目录存在  mkdirs()  创建指定的目录，包括不存在的父母录一并创建
        //file4.mkdir();
        file4.mkdirs();

        //boolean renameTo(File dest) 修改文件名
        File file5=new File("D:\\中软103\\代码\\0322\\bb.txt");
        file2.renameTo(file5);

        //String[] list()   获取指定目录下的所有的文件包含目录 返回值是String[]

        String[] list = file3.list();
        for(String filename:list){
            System.out.println(filename);
        }
        System.out.println("----------------------------");
        //File[] listFiles()  获取指定目录下的所有的文件包含目录 返回值是File[]
        File[] files = file3.listFiles();
        for(File file:files){
            System.out.println(file.getName());
        }


    }
}
