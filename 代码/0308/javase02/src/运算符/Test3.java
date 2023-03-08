package 运算符;

public class Test3 {
    public static void main(String[] args) {

        // ++ 自增 -- 自减
        /*
        i++ 或者++i 对于i 本身来说，都是自增
         */
        int i=7;
        //i++;//就相当于i=i+1  8
        ++i; //8
        System.out.println("i="+i);

        int m=9;
       // int n=m++;// m=10 n=9  对于m来说，自增，但是对于n来说，int n=m++; 变量在前，运算在后； 先赋值后运算
        int n=++m;// m=10 n=10  对于m来说，自增，但是对于n来说，int n=++m; 运算在前，变量在后； 先运算后赋值
        System.out.println("m="+m+" n="+n);


        int l=23;
        //int k=l--;// l=22 k=23
        int k=--l;// l=22 k=22
        System.out.println("l="+l+" k="+k);

    }
}
