package day2;

public class ArithmeticOperators
{
    public static void main(String[] args)
    {
        //1) arithmetic operators + - * / %
        int a = 10,b = 5;
        int  result = a+b;
        System.out.println("The sum of a and b is:"+result);
        System.out.println("The sum of a and b is:"+(a+b));
        System.out.println("The difference of a and b is:"+(a-b));
        System.out.println("The multiplication of a and b is:"+(a*b));
        System.out.println("The division of a and b is:"+(a/b));
        System.out.println("The modulo division of a and b is:"+(a%b));

        //2) Relational/comparison operators > >= < <= != ==
        // return a boolean value true/false

        System.out.println(a>b);   //true
        System.out.println(a<b);   //false
        System.out.println(a>=b);   //true
        System.out.println(a<=b);   //false
        b = 10;
        System.out.println(a<=b);   //true
        System.out.println(a>=b);   //true

        System.out.println(a!=b);   //false
        System.out.println(a==b);   //true

        boolean res = a>b;
        System.out.println(res);    //false


        //Logical operators && || !
        //returns boolean values true/false
        //works between two variables

        boolean  x = true;
        boolean y = false;

        System.out.println(x&&y); //false
        System.out.println(x||y); //true
        System.out.println(!x);   //false
        System.out.println(!y);   //true

        boolean b1 = 10>20 ;
        System.out.println(b1);   //false
        boolean b2 = 10<20;
        System.out.println(b2);   //true

        System.out.println(b1&&b2);   //false
        System.out.println(b1||b2);   //true

        System.out.println((10<20)&&(20>10));  //true



        

    }

}
