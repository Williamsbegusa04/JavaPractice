package day2;

public class DecrementOperator
{
    public static void main(String[] args)
    {
        //case1
        int a = 10;
        a--; //a = a-1
        System.out.println(a);

        //case2
        int b = 100;
        int res = b--;
        System.out.println(res);   //100
        System.out.println(a);     //99

        //case3
        int c = 90;
        int ress = --c;
        System.out.println(ress); //89
        System.out.println(c);    //89

    }
}
