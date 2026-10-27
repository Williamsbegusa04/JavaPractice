package day16;

import java.util.Scanner;

public class Exceptionsdemo {
    public static void main(String[] args)
    {
        System.out.println("Program is started....");

        Scanner sc = new Scanner(System.in);
        //example 1
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(100/num);                 //ArithmeticException if num =0

        //example2
        int a[] = new int[5];
        System.out.println("Enter the position(0-4) ");
        int pos = sc.nextInt();                //ArrayIndexOutOfBoundsException if pos >5
        System.out.println("Enter a value");
        int value = sc.nextInt();
        a[pos] = value;
        System.out.println(a[pos]);

        //example3
        String s = "12345";
        Integer numb = Integer.parseInt(s);  //NumberFormatException when s is not a number

        //example4
        String s1 = "Welcome";
        System.out.println(s1.length());     //NullPointerException if s1  is null


        System.out.println("Program is completed....");
        System.out.println("Program is exited....");
    }
}
