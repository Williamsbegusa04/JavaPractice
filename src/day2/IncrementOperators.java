package day2;

public class IncrementOperators {
    public static void main(String[] args)
    {
        //case1
        int a = 10;
        a++;  //a=a+1
        System.out.println(a);

        //case2  post increment
        int b = 20;
        int res = b++;
        System.out.println(res); //20
        System.out.println(b);  //21

        //case3   pre increment
        int c = 30;
        int ress = ++c;
        System.out.println(ress);  //31
        System.out.println(c);     //31


    }
}
