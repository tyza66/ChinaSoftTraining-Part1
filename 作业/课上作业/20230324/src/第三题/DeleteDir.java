package 第三题;

import java.io.File;

public class DeleteDir {
    public static void main(String[] args) {
        //测试删除一个文件夹
        String path = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\课上作业\\20230324\\被删除的文件";
        new DeleteDir().delete(path);
    }

    public void delete(String path){
        File file = new File(path);
        deleleFile(file);
        deleleDir(file);
        file.delete();
    }
    public void deleleFile(File f){
        File[] fs = f.listFiles();
        for(File one:fs){
            if(one.isFile()){
                one.delete();
            }else{
                deleleFile(one);
            }
        }
    }

    public void deleleDir(File f){
        File[] fs = f.listFiles();
        for(File one:fs){
            if(one.isDirectory()){
                deleleDir(one);
                one.delete();
            }
        }

    }
}
