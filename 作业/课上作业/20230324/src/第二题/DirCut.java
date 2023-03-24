package 第二题;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DirCut {
    //文件件的剪切
    public void dirCutDown(String old,String end) throws FileNotFoundException {
        //获得要剪切的原始文件夹和要输出的目标文件夹上级目录位置
        FileInputStream in = new FileInputStream(new File(old));
        FileOutputStream out = new FileOutputStream(new File(end));
        //先复制目录结构
        
    }
}
