package day15;

public class DataConversionMethods {
    public static void main(String[] args)
    {
        //String ---->int
       // String s = "Welcome";      //cannot convert to Int

        String s1 = "10";
        String s2 = "20";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

        //String ----> double
        String s3 = "10.8";
        String s4 = "20.6";
        System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));

        //String ----> boolean
        String s5 = "true";
        String s6 = "false";
        String s7 = "True";
        String s8 = "welcome";
        System.out.println(Boolean.parseBoolean(s5));   // will return true
        System.out.println(Boolean.parseBoolean(s6));   // will return false
        System.out.println(Boolean.parseBoolean(s7));   // it is not cases sensitive will still return true
        System.out.println(Boolean.parseBoolean(s8));   // it will always return false for anything that is nor true

        //int,double,bool,char-----> String
        int a = 10;
        double d = 10.5;
        char c = 'A';
        boolean bool = true;
        String w = String.valueOf(a);
        String x = String.valueOf(d);
        String y = String.valueOf(c);
        String z = String.valueOf(bool);
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
