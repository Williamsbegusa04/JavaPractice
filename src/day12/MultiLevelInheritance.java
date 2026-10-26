package day12;

public class MultiLevelInheritance {
    static class C
    {
        int c = 150;
        void display()
        {
            System.out.println(c);
        }
    }
    static class D extends C
    {
        int d = 300;
        void show()
        {
            System.out.println(d);
        }
    }
    static class E extends D
    {
        int e = 450;
        void print()
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        E eobj = new E();
        eobj.display();
        eobj.show();
        System.out.println("The addition of c and d is "+(eobj.c+ eobj.d));   // 450
        eobj.print();
        System.out.println("The addition of c, d and e  is "+(eobj.c+ eobj.d+eobj.e));
    }



}
