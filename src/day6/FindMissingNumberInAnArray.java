package day6;

public class FindMissingNumberInAnArray {
    public static void main(String[] args)
    {
        int a[] = {11,12,13,18};


        //sort array
        for(int j = 0;j<a.length-1;j++)

        {
            for (int i = 0; i < a.length - 1; i++) {
                int temp = 0;
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }

        }

        //check for duplicates in array
        int count = 0;
        int num = 200;
        boolean duplicate = false;
        for(int i = 0;i<a.length;i++)
        {
            num = a[i];
            for(int x : a)
            {
                if(x==num)
                {
                    count++;
                }
            }
        }
       //after confirming no duplicates
        if(duplicate == false)
        {
            for (int i = 0; i < a.length - 1; i++)
            {
                if (a[i + 1] - a[i] != 1)
                {
                    System.out.println("Missing number");
                    for (int m = a[i] + 1; m < a[i + 1]; m++) {
                        System.out.print(" " + m +",");
                    }
                }
            }
        }
    }


}
