package day2;

public class TenaryOperator
{
    public static void main(String[] args)
    {
        //Tenary Operator ?:
        //var = exp? result1 : result2
        //case1
        int a = 200, b= 100;
        int x = (a>b)? a:b;
        System.out.println(x);

        //case2
        int y = (1==1)? 100:200;
        System.out.println(y);

        //case3
        int person_age = 10;
        String z = (person_age>=18)? "Eligible":"Not eligible";
        System.out.println(z);
    }


}
