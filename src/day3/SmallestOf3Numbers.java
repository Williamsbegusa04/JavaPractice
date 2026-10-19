package day3;

public class SmallestOf3Numbers {
    public static void main(String[] args)
    {
        int a = 10, b= 20, c= 30;

        if(a<b && a<c)
        {
            System.out.println("a is the smallest number "+a);
        }
        else if(b<a && b<c)
        {
            System.out.println("b is the smallest number "+b);
        }
        else
        {
            System.out.println("c is the smallest number "+c);
        }
    }
}
