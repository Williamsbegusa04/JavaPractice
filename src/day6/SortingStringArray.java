package day6;

import java.util.Arrays;

public class SortingStringArray {
    public static void main(String[] args)
    {
        String s[] = {"A","C","D","B","T"};

        System.out.println("Before sorting....");
        System.out.println( Arrays.toString(s));

        Arrays.sort(s);

        System.out.println("after sorting....");
        System.out.println( Arrays.toString(s));
    }
}
