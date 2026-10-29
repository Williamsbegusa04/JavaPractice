package day17;

class Parent
{
    String name = "John";
    void m1()
    {
        System.out.println("This is m1() from parent");
    }
}
class Child extends Parent
{
    int id = 102;
    void m2()
    {
        System.out.println("This is m2() from child");
    }
}

public class TypeCastingObjects1 {
    public static void main(String[] args)
    {
        Child c = new Child();
        System.out.println(c.name);     //Parent variable
        c.m1();                         //parent method
        System.out.println(c.id);       //Child variable
        c.m2();                         //Child method


        //Upcasting smaller object into higher variable
        Parent p = new Child();
        System.out.println(p.name);     //attributes and behaviors from parent class
        p.m1();

//        System.out.println(p.id);       //can't access child methods and variables because p is a parent variable
//        p.m2();

        //downcasting storing higher object in smaller variable
        /*Parent p1 = new Parent();
        Child c1 = (Child)p1;
        System.out.println(c1.name);     //attributes and behaviors from parent class
        c1.m1();
        System.out.println(c1.id);       //can access child methods and variables because c1 is a child  variable
        c1.m2();*/

        //will lead to exception at runtime




    }
}
