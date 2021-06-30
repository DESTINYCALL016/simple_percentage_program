package com.company;
import java.util.Scanner;

public class AC_problempercent {
    public static void main(String[] args) {
        System.out.println("enter sub1");
        Scanner sc= new Scanner(System.in);
        int a1=sc.nextInt();

        System.out.println("enter sub2");

       int a2=sc.nextInt();
        System.out.println("enter sub3");
        int a3= sc.nextInt();
        System.out.println("enter sub4");
        float a4 = sc.nextInt();
        System.out.println("enter sub5");
        float a5 = sc.nextInt();
        float sum=a1+a2+a3+a4+a5;

        float per=sum/5;
        System.out.print("percentage:");
        System.out.println(per);



    }

}
