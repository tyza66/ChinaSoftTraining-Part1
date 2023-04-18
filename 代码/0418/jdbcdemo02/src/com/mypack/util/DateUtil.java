package com.mypack.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    // util.date转换成sql.date
    public static java.sql.Date toSqlDate(Date date){

        return  new java.sql.Date(date.getTime());
    }

    // sql.date转换成util.date
    public static Date toUtilDate(java.sql.Date date){
        return new Date(date.getTime());
    }

    //String 转换成发 util.Date
    public static Date strToUtilDate(String dateStr){

        Date date = null;
        //注意format的格式要与日期String的格式相匹配
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdf.parse(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }
    //util.Date转换为String

    public static String dateToStr(Date date){

        String dateStr = "";
        //format的格式可以任意
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        try {
            dateStr = sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateStr;
    }



}