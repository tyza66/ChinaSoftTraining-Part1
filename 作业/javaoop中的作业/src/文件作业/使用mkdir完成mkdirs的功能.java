package 文件作业;

import java.io.File;

public class 使用mkdir完成mkdirs的功能 {
    public static void main(String[] args) {
        String path = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\文件作业\\我是一个新新的文件夹\\giao2";
        File f = new File(path);
        //f.mkdir();
        //f.mkdirs();
        superMkdir(f);
    }
    
    public static void superMkdir(File file){
        String[] split = file.getPath().split("\\\\");
        String filePath = "";
        for (String i:split){
            filePath = filePath + i;
            File f = new File(filePath);
            if(!f.exists()){
                f.mkdir();
            }
            filePath += "\\";
        }
    }
}
