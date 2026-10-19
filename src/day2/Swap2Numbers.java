package day2;

public class Swap2Numbers
{
    public static void main(String[] args)
    {
        //bedfore the swap
        int a = 10;
        int b = 15;
        System.out.println("before swapping a is "+a+" and b is "+b);

        a = a+b;
        b = a-b;
        a = a-b;


        //after the swap
        System.out.println("after swapping the new value of a is "+a+" and b is "+b);
    }
}
