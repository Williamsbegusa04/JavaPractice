package day4;

public class Forloop
{
    public static void main(String[] args)
    {
        //Ex1 print 1-10
        for(int i = 1;i<=10;i++)
        {
            System.out.println(i);
        }

        //Ex2 print even numbers from 1-10
        for(int i = 2;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

        //Ex3 Print even or odd 1-10
        for(int i = 1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even "+i);
            }
            else
            {
                System.out.println("Odd "+i);
            }
        }

        //Ex4 print 10-1
        for(int i = 10;i>=1;i--)
        {
            System.out.println(i);
        }
    }
}
