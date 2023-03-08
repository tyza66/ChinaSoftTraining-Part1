package 循环结构;

public class TestForFor {

    public static void main(String[] args) {

        //循环的嵌套
        //外循环循环一次，内循环循环一遍；依次类推；最终外循环可以表示行数，内循环的表示每行的元素个数
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
