package com.zy.utils;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {

    @Test
    public void test(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        String endDate = sdf.format(calendar.getTime()) + " 23:59:59";
        calendar.add(Calendar.DAY_OF_MONTH, -7);
        String startDate = sdf.format(calendar.getTime()) + " 00:00:00";

        System.out.println(startDate);
    }
}
