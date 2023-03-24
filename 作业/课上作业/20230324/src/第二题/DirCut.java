package 第二题;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DirCut {
    public static void main(String[] args) {

    }
    //文件夹的剪切
    public void dirCopyDown(String old,String end) throws FileNotFoundException {
        //文件夹是一个树的结构其实 我们要走到树干复制树干（文件夹） 走到果子复制果子（文件）
        //获得要剪切的原始文件夹和要输出的目标文件夹上级目录或者文件位置
        File fold =new File(old);
        File fend =new File(end);
        FileInputStream in = new FileInputStream(fold);
        FileOutputStream out = new FileOutputStream(fend);
        if(fold.isDirectory()){
            new File(end+"\\"+fold.getName()).mkdir();
            for(File f:fold.listFiles()){
                dirCopyDown(f.getAbsolutePath(),end+"\\"+fold.getName());
            }
        }else{

        }

    }


}
