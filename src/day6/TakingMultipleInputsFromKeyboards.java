package day6;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboards {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number:");
        int num2 = sc.nextInt();

        System.out.println("Addition of the to numbers is "+(num1+num2));

        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("your name is "+name);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Enter Uknown value");
        Object value = sc.next();
        System.out.println(value);
    }

}
