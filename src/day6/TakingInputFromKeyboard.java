package day6;

import java.util.Scanner;

public class TakingInputFromKeyboard {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //whole numbers
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Given number is: "+num);

        //Decimal
        System.out.println("Enter a decimal : ");
        double temp = sc.nextDouble();
        System.out.println("Given decimal is: "+temp);

        //String
        System.out.println("Enter your City: ");
        String city = sc.next();
        System.out.println("Your City is "+city);
    }
}
