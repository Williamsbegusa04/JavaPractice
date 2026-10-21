package day8;

public class StringComparison {
    public static void main(String[] args)
    {
        //case1
        String s1 = "welcome";
        String s2 = "welcome";

        System.out.println(s1==s2);  //true
        System.out.println(s1.equals(s2));  //true

        //case2
        String s3 = new String("welcome");
        String s4 =new String( "welcome");

        System.out.println(s3 ==s4);  //false    compare objects
        System.out.println(s3.equals(s4));  //true  compare values of onjects

        //case 3
        String s5 = "Abc";
        String s6 = new String("Abc");
        System.out.println(s5 ==s6);  //false
        System.out.println(s3.equals(s4));  //true

        //case 4
        String s7 = s6;
        System.out.println(s7 ==s6);  //true
        System.out.println(s7.equals(s6)); //true
        System.out.println(s7==s5);//false
        System.out.println(s7.equals(s5));



    }
}
