package 昨天作业;

import java.io.File;

public class TestFile03 {

    public static void main(String[] args) {

        File f = new File("D:\\中软103\\代码\\0323\\aa\\bb\\cc\\dd");
        creatDir(f);
    }

    public static void creatDir(File f) {


        File parentDir = f.getParentFile();
        //判断父目录是否存在
        if (parentDir.exists()) {
            //存在，则直接创建
            f.mkdir();
        } else {
            //不存在，递归调用
            creatDir(parentDir);
            f.mkdir();


        }

    }

}
