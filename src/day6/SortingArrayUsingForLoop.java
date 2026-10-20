package day6;

import java.util.Arrays;

public class SortingArrayUsingForLoop {
    public static void main(String[] args)
    {
        int a[] = {100,900,10000,50,6};
        int sorted_arr[]= new int [a.length];

        for(int j = 0;j<a.length-1;j++)
        {
            for( int i = 0; i<a.length-1;i++)
            {
                int larger_num =0;
                if(a[i]>a[i+1])
                {
                    larger_num =a[i];
                    a[i] = a[i+1];
                    a[i+1] = larger_num;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
