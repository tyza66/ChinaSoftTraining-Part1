package 常识工具类;

//这是一个常识工具类，里面实现了五个方法
public class DateCommonsTools {
    //根据星期值，返回对应的英语单词
    public String getWeekWord(int week){
        if (week>=1&&week<=7){
            String[] arr = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
            return arr[week-1];
        }
        return "";
    }
    //根据月份值，返回对应的英语单词
    public String getMonthWorld(int month){
        if (month>=1&&month<=12){
            String[] arr = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
            return arr[month-1];
        }
        return "";
    }
    //返回某年某月的总天数
    //获取某年的总天数
    //判断某年是否是闰年,定义为private的目的在于只供当前类中的另外2个方法进行调用
}
