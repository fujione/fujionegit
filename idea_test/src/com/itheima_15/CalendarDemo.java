package com.itheima_15;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int date = calendar.get(Calendar.DATE);

        System.out.println(year+"年"+month+"月"+date+"日");

        calendar.add(Calendar.DATE,+10);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH)+1;
        date = calendar.get(Calendar.DATE);

        System.out.println(year+"年"+month+"月"+date+"日");

        calendar.add(Calendar.DATE,+1);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH)+1;
        date = calendar.get(Calendar.DATE);

        System.out.println(year+"年"+month+"月"+date+"日");

        calendar.add(Calendar.DATE,-31);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH)+1;
        date = calendar.get(Calendar.DATE);

        System.out.println(year+"年"+month+"月"+date+"日");

        calendar.add(Calendar.DATE,-30);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH)+1;
        date = calendar.get(Calendar.DATE);

        System.out.println(year+"年"+month+"月"+date+"日");

    }
}
