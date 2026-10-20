package day5;

import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args)
    {
        //Declaring an array
        //approach 1
        int a[] = new int[5];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;
        //approach 2
        int b[] = {500,600,700,800,900};

        //length of an array
        System.out.println(a.length);

        //read single value from an array
        System.out.println(b[2]);

        //read all values from an array
        //using normal for loop
        System.out.println("reading all values from an array using for loop..");
        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        //Using Enhanced for loop
        System.out.println("reading all values from an array using enhanced for loop..");
        for(int x :b)
        {
            System.out.println(x);
        }
        //using in bult array method
        System.out.println("reading all values from an array using in built method.."+ Arrays.toString(a));

    }
}
