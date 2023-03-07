

public class Test8 {

    public static void main(String[] args) {

        /*
        boolean条件表达式 ? 表达式1 :  表达式2 ;
			如果条件表达式为true时，执行表达式1；否则执行表达式2
         */

        int m=5,n=3;
        String s=m>n?"m比n大":"m比n小";
        System.out.println(s);

        boolean bl= m<n?true:false;
        System.out.println(bl);

        int i=11,j=9;
        String s2=i>j?i+"比"+j+"大":i+"比"+j+"小";
        System.out.println(s2);
    }
}
