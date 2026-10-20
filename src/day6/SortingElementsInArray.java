package day6;

import java.util.Arrays;

public class SortingElementsInArray {
    public static void main(String[] args)
    {
        int a [] = {400,600,700,200,500};

        System.out.println("Before sorting....");
        System.out.println( Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("after sorting....");
        System.out.println( Arrays.toString(a));

    }
}
