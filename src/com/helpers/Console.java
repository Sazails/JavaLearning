package com.helpers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Console {
    public static void printLine(String text){
        System.out.println(getDate() + text);
    }

    public static void printLine(char character){
        System.out.println(getDate() + character);
    }

    public static void printLine(double number){
        System.out.println(getDate() + number);
    }

    public static void printLine(float number){
        System.out.println(getDate() + number);
    }

    public static void printLine(byte number){
        System.out.println(getDate() + number);
    }

    public static void printLine(int number){
        System.out.println(getDate() + number);
    }

    public static void print(String text){
        System.out.print(getDate() + text);
    }

    public static void print(char character){
        System.out.print(getDate() + character);
    }

    public static void print(double number){
        System.out.print(getDate() + number);
    }

    public static void print(float number){
        System.out.print(getDate() + number);
    }

    public static void print(byte number){
        System.out.print(getDate() + number);
    }

    public static void print(int number){
        System.out.print(getDate() + number);
    }

    public static void printDashedLine(){
        System.out.println("============================================================");
    }

    private static String getDate(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dateFormatter.format(now) + " - ";
    }
}
