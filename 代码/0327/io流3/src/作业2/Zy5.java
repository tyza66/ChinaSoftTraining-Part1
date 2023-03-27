package 作业2;

import java.io.*;

public class Zy5 {
    public static void main(String[] args) {
        //实现文件夹的复制

        File src=new File("D:\\中软103\\代码\\0323");
        File tar=new File("D:\\aaa");
        try {
            doCopy(src,tar);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doCopy(File src,File tar) throws IOException {
        //src就是文件夹
        if(!src.exists()){

            src.mkdirs();
        }
        if(!tar.exists()){
            tar.mkdirs();
        }
        File[] files = src.listFiles();
        for(File temp:files){
            if(temp.isFile()){
                //判断是否是文件，文件直接复制
                File target=new File(tar,temp.getName());
                copyFile(temp,target);
            }else{
                //目录则递归调用
                File target=new File(tar,temp.getName());
                //判断目标目录是否存在，不存在，直接创建
                if(!target.exists()){
                    target.mkdirs();
                }
                doCopy(temp,target);
            }
        }

    }

    public static void copyFile(File src, File tar) throws IOException {
        InputStream in=new FileInputStream(src);
        FileOutputStream out=new FileOutputStream(tar);

        int data=0;
        byte[] bytes=new byte[1024];
        while((data=in.read(bytes))!=-1){
            out.write(bytes);
        }

        //关闭资源
        in.close();
        out.close();

    }
}
