package day6;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a [] = new int[5];

        for(int i = 0;i<a.length;i++)
        {
            System.out.println("Enter number value for "+i+" position");
            a[i] = sc.nextInt();
        }
        System.out.println("Here is your complete Array "+Arrays.toString(a));
    }
}
