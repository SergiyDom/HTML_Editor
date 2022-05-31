package com.task3209;

public class ExceptionHandler extends Exception {
    public static void log(Exception e) {
        System.out.println(e.toString());
    }
}
