package day14;

//multi inheritance with interfaces

public class c1 extends c2 implements I1,I2 {
    public void m1()
    {
        System.out.println(x);
    }
    public void m2()
    {
        System.out.println(y);
    }

    public static void main(String[] args)
    {
        c1 cobj = new c1();
        cobj.m1();
        cobj.m2();
        cobj.m3();
    }
}
