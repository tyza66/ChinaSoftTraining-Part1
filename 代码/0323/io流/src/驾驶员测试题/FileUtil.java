package 驾驶员测试题;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public List<Question> parseFile(File file) throws IOException {

        List<Question> list=new ArrayList<>();
        BufferedReader br=new BufferedReader(new FileReader(file));
        String line=null;
        Question q=null;
        while((line=br.readLine())!=null){
            line=line.trim();
            //对解析出来的每一行进行分析判断
            if(isTitle(line)){
                q=new Question();
                q.setTitle(line);
                list.add(q);
            }else if(isOptiona(line)){
                q.setOptiona(line);
            }else if(isOptionb(line)){
                q.setOptionb(line);
            }else if(isOptionc(line)){
                q.setOptionc(line);
            }else if(isOptiond(line)){
                q.setOptiond(line);
            }else if(isAnswer(line)){
                q.setAnswer(line);
            }
        }

        return list;
    }

    public boolean isTitle(String line){
        boolean bl=false;
        if(line.length()>=2&&line.indexOf(".")!=-1){
            bl=true;
        }
        return bl;
    }

    public boolean isOptiona(String line){
        boolean bl=false;
        if(line.length()>=2&&line.startsWith("A")){
            bl=true;
        }
        return bl;
    }
    public boolean isOptionb(String line){
        boolean bl=false;
        if(line.length()>=2&&line.startsWith("B")){
            bl=true;
        }
        return bl;
    }
    public boolean isOptionc(String line){
        boolean bl=false;
        if(line.length()>=2&&line.startsWith("C")){
            bl=true;
        }
        return bl;
    }

    public boolean isOptiond(String line){
        boolean bl=false;
        if(line.length()>=2&&line.startsWith("D")){
            bl=true;
        }
        return bl;
    }

    public boolean isAnswer(String line){
        boolean bl=false;
        if(line.length()==1){
            bl=true;
        }
        return bl;
    }
}
