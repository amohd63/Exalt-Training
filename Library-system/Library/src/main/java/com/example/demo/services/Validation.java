package com.example.demo.services;

import java.sql.Date;

public class Validation {
    public static boolean greaterThan(int num1, int num2){
        return num1 > num2;
    }

    public static boolean greaterThan(Date date1, Date date2){
        return date1.after(date2);
    }


}
