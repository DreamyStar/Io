package com.zlq.lo.test;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
    public static void main(String[] args) throws Exception {
        Date d = new Date();
        System.out.println(d);
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        c.set(2022,8,23);
        System.out.println(c.getTime());
        c.setTimeInMillis(System.currentTimeMillis());
        System.out.println(c.getTime());
        Date d2 = c.getTime();
        System.out.println(d2.getYear()+1900);
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.YEAR));
        GregorianCalendar r = (GregorianCalendar) c;
        System.out.println(r.isLeapYear(2021));
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String s1 = s.format(new Date());
        System.out.println(s1);
        Date s2 = s.parse(s1);
        System.out.println(s2);
        s2 = s.parse("2000-12-23");
        System.out.println(s2);
        DecimalFormat d3 = new DecimalFormat("####.##");
        String s3 = d3.format(2012.32);
        System.out.println(s3);
        Double e = (Double) d3.parse("2009.23");
        System.out.println(e);
    }

}
