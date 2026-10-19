package day3;

public class LargestOf2Numbers_IfElse {
    public static void main(String[] args) {
        int a = 10, b = 20;

        if(a>b)
        {
            System.out.println("a is the largest number "+a);
        }
        else if(a<b)
        {
            System.out.println("b is the largest number "+b);
        }
        else
        {
            System.out.println("The two numbers are equal");
        }
    }
}
