package day12;

public class HierarchyInheritance {
    static class Parent
    {
        int c = 150;
        void display()
        {
            System.out.println(c);
        }
    }
    static class Child1 extends Parent
    {
        int d = 300;
        void show()
        {
            System.out.println(d);
        }
    }
    static class Child2 extends Parent
    {
        int e = 450;
        void print()
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        Child1 c1 = new Child1();
        c1.show();        // method unique to only Child1 class
        c1.display();     //method inherited from parent class

        Child2 c2 = new Child2();
        c2.print();         //method unique to only Child2 class
        c2.display();       //method inherited from parent class
    }
}
