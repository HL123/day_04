package com.example;

import java.util.Calendar;

/**
 * Created by huanglei on 17/4/10.
 */
public class DatingGame {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1999,12,31);
        System.out.println(cal.get(Calendar.YEAR));
    }
}
