package day6;

public class SmallestNumberInAnArray {
    public static void main(String[] args) {
        int a[] = {100,900,10000,50,10001,6,11,0};

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

        //Largest number will be in the first position of the array
        int smallest_num = a[0];
        System.out.println("The smallest number in the array is: "+smallest_num);
    }
}
