package day4;

public class WhileLoopdemo {
    public static void main(String[] args)
    {
        //Ex1 print 1...10
        int i =1;
       /* while(i<=10)
        {
            System.out.println(i);
            i++;
        }*/

        //Ex2 print Hello message 10 times

        /*while(i<=10)
        {
            System.out.println("Hello");
            i++;
        }*/

        //Ex3 print even numbers between 1-10
        //approach 1
        int j = 2;
        while(j<=10)
        {
            System.out.println(j);
            j+=2;
        }
        //approach2
        /*while(i<=10)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }*/

        //Ex4 specify 1-10 even or odd
       /* while(i<=10)
        {
            if(i%2==0)
            {
                System.out.println("Even "+i);
            }
            else
            {
                System.out.println("Odd "+i);
            }
            i++;
        }*/

        //print 10-1
        int k = 10;
        while(k>=1)
        {
            System.out.println(k);
            k--;
        }
    }
}
