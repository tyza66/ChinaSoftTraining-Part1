package 学生继承人类;

public class Student extends Person {
    private String id="id123";//覆盖定义
    @Override
    public String toString() {  //重新定义toString方法
        return "年龄:"+age  //protected表示同包或者子类中可见
//				+"编号:"+id;   //因为父类中的id是private的，所以不能直接访问
//				+"编号："+getId()
                +"编号:"+id  //是当前类中重新定义的id，不是从父类中继承的id
                +"姓名:"+name//默认package表示同包可见
                +"出生日期："+birth; //public表示到处可见
    }
}

