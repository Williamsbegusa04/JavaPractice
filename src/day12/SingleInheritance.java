package day12;

public class SingleInheritance {
    static class A
    {
        int a = 100;
        void display()
        {
            System.out.println(a);
        }
    }
    static class B extends A
    {
        int b = 200;
        void show()
        {
            System.out.println(b);
        }
    }
    public static void main(String[] args) {

        B bobj = new B();

        System.out.println("The value of a is "+bobj.a);
        System.out.println("The value of b is "+bobj.b);
        bobj.display();
        bobj.show();

    }
}
