package day11;

//1) Static can access static stuff without any  object
//2) Static method can access non-static stuff through Objects
//3) Non static stuff  can access everything directly


public class Staticdemo {
    static  int a = 10;   /// static variable
    int b = 20 ;

    static void  m1()   //static method
    {
        System.out.println("This is m1() a static method");
    }

    static void  m2()   //non static method
    {
        System.out.println("This is m2() a non static method");
    }

    void m()
    {
        System.out.println("This is m() method");
        System.out.println("========================");
        System.out.println(a);
        System.out.println(a);
        m1();
        m2();
    }


    public static void main(String[] args)
    {
        System.out.println(a);   // static things can access static things since main method is static it can access
        //System.out.println(b);  //b is a non static variable so main method can't access it
        //m2();         //m2() is a non static method so it can not be accessed  by main method
        Staticdemo sd = new Staticdemo();
        System.out.println("b is :"+sd.b);
        sd.m2();

        sd.m();
    }

}
