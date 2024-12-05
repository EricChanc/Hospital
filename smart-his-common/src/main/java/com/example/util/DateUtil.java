package com.example.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DateUtil {

    private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);


    /**
     * 根据生日计算年龄
     */
    public static Integer getAgeByBirthday(String birthday) {
        if(null == birthday ||"".equals(birthday)){
            return null;
        }
        LocalDate now = LocalDate.now();
        LocalDate birthdayDate = LocalDate.parse(birthday);
        Period between = Period.between(birthdayDate, now);
        Integer years = between.getYears();
        return years;
    }





    /**
     * 获取系统当前时间字符串格式
     */
    public static String getDateStr(String Str) {
        Date now = new Date();
        DateFormat dateFormat = new SimpleDateFormat(Str);
        return dateFormat.format(now);
    }

    /**
     * @param dateList "2024-11-20","2024-11-21","2024-11-22","2024-11-23","2024-11-24"
     * @param orderDate 工作日 1,2,3,4,5
     * @return
     */
    public static List<String> checkDate(List<String> dateList, String orderDate) {
        List<String> list=new ArrayList<>();
        if (null == dateList || dateList.size() == 0 || null == orderDate) {
            return list;
        }
        String[] orderDateArray = orderDate.split(",");
        for (String dateStr : dateList) {
            int value = LocalDate.parse(dateStr).getDayOfWeek().getValue();
            //logger.info(dateStr+"是周："+value);
            for (String orderD : orderDateArray) {
                if(orderD.equals(value+"")){
                    list.add(dateStr);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"2024-11-20","2024-11-21","2024-11-22","2024-11-23","2024-11-24"};


       List<String> data=  checkDate(Arrays.asList(array),"6,7");
        for (String datum : data) {
            System.out.println(datum);
        }
    }
}
