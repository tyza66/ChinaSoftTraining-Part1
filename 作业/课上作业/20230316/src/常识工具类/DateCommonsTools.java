package 常识工具类;

//这是一个常识工具类，里面实现了五个方法
public class DateCommonsTools {
    //根据星期值，返回对应的英语单词
    public String getWeekWord(int week) {
        if (week >= 1 && week <= 7) {
            String[] arr = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            return arr[week - 1];
        }
        return "";
    }

    //根据月份值，返回对应的英语单词
    public String getMonthWorld(int month) {
        if (month >= 1 && month <= 12) {
            String[] arr = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            return arr[month - 1];
        }
        return "";
    }

    //返回某年某月的总天数
    public int getYearMonthDays(int year, int month) {
        switch (month) {
            case 1:
                return 31;
            case 2://特殊
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return 0;
    }
    //获取某年的总天数
    public int getYearDays(int year){
        if (isLeapYear(year))
            return 366;
        else
            return 365;
    }
    //判断某年是否是闰年,定义为private的目的在于只供当前类中的另外2个方法进行调用
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
