package day13;

class Test1
{
    void m()
    {
        System.out.println("This is m method from Test1");
    }
}
class Test2 extends Test1
{
    void m()
    {
        System.out.println("This is m method from Test2");  //overriding
    }
}

public class FinalKeyword2 {

    public static void main(String[] args)
    {
        Test2 t2 = new Test2();
        t2.m();
    }
}
