package 作业2;

import java.io.File;

public class Zy4 {
    //删除当前项目文件夹
    public static void main(String[] args) {

        File file=new File("D:\\aaa");
        delete(file);
    }

    public static void delete(File file){
        if(file.exists()){
            //判断是否是物理文件

            if(file.isFile()){
                //直接删除  delete() 删除文件或者空的目录
                file.delete();
            }else if(file.isDirectory()){
                //判断是否是目录
                File[] children = file.listFiles();
                for(File temp:children){
                    delete(temp);
                }
                file.delete();

            }

        }
    }
}
