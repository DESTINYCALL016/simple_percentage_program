package com.company;
import java.util.Scanner;

public class ch4conditions {
    public static void main(String[] args) {
        int age= 36;
        if(age>=18)
            System.out.println("you can drive");
        else
            System.out.println("no you can't drive");


        System.out.println("which day you like most ");
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        switch (str) {
            case "monday" -> System.out.println("sunny day");
            case "tuesday" -> System.out.println("2");
            default -> System.out.println("10");
        }
    }
}
