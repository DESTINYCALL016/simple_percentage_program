package com.company;

import java.util.Scanner;
public class rockpaper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ROC-rock , PAP-paper , SCI-scissor");
        String a,b;

        System.out.println("player 1 please enter your choice");
        a=sc.next();
        System.out.println("player 2 please enter your choice");
        b=sc.next();
        if(a.equals("SIS")&&b.equals("PAP"))

            System.out.println("player1 wins");

        else if(a.equals("ROC")&&b.equals("PAP"))

            System.out.println("player2 wins");

                 else if(a.equals("PAP")&&b.equals("PAP"))

            System.out.println("Draw");
                 else if(a.equals("ROC")&&b.equals("SIS"))

            System.out.println("player1 wins");
                 else if(a.equals("PAP")&&b.equals("SIS"))

            System.out.println("player2 wins");



        else   if(a.equals("SIS")&&b.equals("SIS"))

            System.out.println("draw");
         else if(a.equals("ROC")&&b.equals("ROC"))

            System.out.println("draw");
                 else if(a.equals("PAP")&&b.equals("ROC"))

            System.out.println("player1 wins");



        else   if(a.equals("SIS")&&b.equals("ROC"))

            System.out.println("player2 wins");


    }

}
