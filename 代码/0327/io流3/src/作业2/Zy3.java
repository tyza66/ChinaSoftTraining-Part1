package 作业2;

import java.io.*;

public class Zy3 {
    public static void main(String[] args) {

        //实现文件夹的剪切  先复制 后删除
        File src=new File("D:\\中软103\\代码\\0324");
        File tar=new File("D:\\aaa");
        try {
            cut(src,tar);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cut(File src, File tar) throws IOException {
        //src有可能是个目录或文件
        if(src.exists()){
            //先创建目标文件夹
            if(!tar.exists()){
                tar.mkdirs();
            }
            if(src.isFile()){
                //实现拷贝，再删除功能
                //目标的文件名
                File target=new File(tar,src.getName());
                copy(src,target);

            }else if(src.isDirectory()){
                //递归调用 destFile也是个目录
                //如果是目录，先在目标目录下创建出新的目录
                File destFile=new File(tar,src.getName());
                destFile.mkdirs();
                File[] children = src.listFiles();
                for(File temp:children){
                    //递归调用
                    cut(temp,destFile);
                }
            }

            //删除文件或者空的目录
            src.delete();
        }
    }

    public static void copy(File src,File tar) throws IOException {
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
