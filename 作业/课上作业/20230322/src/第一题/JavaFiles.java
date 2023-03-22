package 第一题;

import java.io.File;

public class JavaFiles {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\课上作业\\20230322\\src\\第一题");
        File[] files = f.listFiles();
        for(File file:files){
            if(file.getName().endsWith("java")){
                System.out.println(file.getName());
            }
        }
    }
}
