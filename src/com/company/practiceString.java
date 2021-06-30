package com.company;
import java.util.Locale;
import java.util.Scanner;
public class practiceString {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter your complete name in lower case");
        str=sc.nextLine();
       String str2;
        str2=str.toLowerCase();
        boolean b=str.equals(str2);
        if(b)
            System.out.printf("in uppercase %s",str.toUpperCase() );

        else
           System.out.println("not in lower case");


      /*  System.out.println("enter name ");
        str=sc.nextLine();
        System.out.println(str.replace(' ','_'));  */




       /* System.out.println("enter name ");
        str=sc.nextLine();
        System.out.printf("Dear %s , Thanks a lot",str);*/

      /*  System.out.println("enter phrase");
         str=sc.nextLine();
         int a=str.indexOf(' ');
         int b=str.lastIndexOf(' ');
         if(a==b)
             System.out.println("no double or more space");
         else
             System.out.println("double or more space");  */






    }
}
