package com.company;
import java.util.Scanner;

public class lecture2_ch4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     /*  System.out.println("enter max marks in subjects");
        float max;

        max=sc.nextFloat();
        System.out.println("enter marks of subject 1");
       float sub1,sub2,sub3;
       sub1=sc.nextInt();
        System.out.println("enter marks of subject 2");
        sub2=sc.nextInt();
        System.out.println("enter marks of subject 3");
        sub3=sc.nextInt();
        float per;
        per=(sub1+sub2+sub3)*100/max;
        if (per>=40&&(sub1*100)/max>=33&&(sub2*100)/max>=33&&(sub3*100)/max>=33)
            System.out.println("you have passed");
        else
            System.out.println("you have failed");
            */


      /*  System.out.println("enter income ");
        float inc=sc.nextFloat();
        if(inc<=250000)
                System.out.println("no tax to pay");
        else if(inc>250000&&inc<=500000)
              {
                  float a;
                     a=(inc*5)/100;
                  System.out.printf("tax %f",a);}


                    else if(inc>500000&&inc<=1000000)
                        {   float a=(inc*20)/100;

                            System.out.printf("tax %f",a);}


                           else
                                {float a=(inc*20)/100;
                                    System.out.printf("tax %f",a);}
                           */




     /*   System.out.println("enter year");
        int year=sc.nextInt();
        if (year%4==0&&year%400==0)
            System.out.println("year is leap year");
        else
            System.out.println("not a leap year" );     */


        System.out.println("enter website");
        String str=sc.nextLine();
        int a=str.lastIndexOf('.');

        if(str.endsWith("com"))
        { System.out.println("commertial site");
            }

        if(str.endsWith("in"));
        {System.out.println("indian site");}

        if(str.endsWith("org"));
        {System.out.println("orgainisational site");}




    }
}
