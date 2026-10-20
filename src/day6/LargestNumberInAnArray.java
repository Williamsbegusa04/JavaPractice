package day6;

public class LargestNumberInAnArray {
    public static void main(String[] args) {
        int a[] = {100,900,10000,50,10001};

        //sort array first
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

        //Largest number will be in the last position of the array
        int largest_num = a[a.length-1];
        System.out.println("The largest number in the array is: "+largest_num);
    }
}
