package 文件作业;

import java.io.File;

public class 文件作业1 {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\文件作业");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
