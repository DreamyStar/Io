package com.zlq.zlq.test;

import javax.jws.soap.SOAPBinding;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
//        long a = System.currentTimeMillis();
//        System.out.println(a);
//        Date d = new Date(a);
//        System.out.println(d);
//        System.out.println(d.getYear()+1900);
//        System.out.println(d.getMonth()+1);
//        System.out.println(d.getDate());
//        System.out.println(d.getDay());
//        System.out.println(d.getHours());
//        System.out.println(d.getSeconds());
//        System.out.println(d.getTime());
        Calendar c = Calendar.getInstance();
        c.set(2021,8,18);
//        System.out.println(System.currentTimeMillis());
        System.out.println(c.getTime());
        Date d = c.getTime();
        System.out.println(d);
        System.out.println(d.getYear()+1900);
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getWeekYear());
        System.out.println(System.currentTimeMillis());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
    }
}
