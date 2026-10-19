package day1;

public class DataTypes_demo
{
    public static void main(String[] args)
    {
        //numeric data types
        int a = 100;
        System.out.println("The value of a is:"+a);
        int b = 200;
        System.out.println("The value of b is:"+b);

        System.out.println("The sum of a and b is:"+(a+b));

        byte by = 125;
        System.out.println(by);

        short sh = 3535;
        System.out.println(sh);

        long l = 123456789L;
        System.out.println(l);

        //decimal numbers-float&double
        float item_price = 15.5f; //literal is needed
        System.out.println(item_price);

        double db = 134.4343412;
        System.out.println(db);

        // Char
        char grad = 'A';
        System.out.println(grad);

        //String
        String name = "John";
        System.out.println(name);

        // char ch = 'ABC';        //invalid
        // String ch = 'ABC';      //invalid
        // String ch = 'A';        //invalid
        String ch = "A";           //invalid

        //Boolean
        boolean bl = true;   // allows only true or false
        System.out.println(bl);

       // boolean bb = 'true';    //invalid
      //  boolean bb = "false";    //invalid
      //  String bb = true;    //invalid


    }
}
