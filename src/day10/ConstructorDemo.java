package day10;

public class ConstructorDemo {
    int x,y;
    ConstructorDemo() //default constructor
    {
        x=100;
        y=200;
    }

    ConstructorDemo(int a,int b)
    {
        x = a;
        y = b;
    }
    int sum()
    {
        return(x+y);
    }

    public static void main(String[] args)
    {
        ConstructorDemo cd = new ConstructorDemo(); // default constructor
        System.out.println(cd.sum());

        ConstructorDemo cd1 = new ConstructorDemo(300,400); //parameterized constructor
        System.out.println(cd1.sum());
    }
}
