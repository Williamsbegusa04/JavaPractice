package day7;

import java.util.Arrays;
import java.util.Locale;

public class StringMethods {
    public static void main(String[] args)
    {

        String s = "ta daaa";  //approach1
        String t = new String("abracadabra"); //approach2

        //concat() - joining Strings
        String s1 = "welcome";
        String s2 = "to java";

        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

        String s3 = "automation";
        System.out.println(s1+s2+s3);
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s1.concat(s2+s3));
        System.out.println("welcome"+"to java");
        System.out.println("welcome".concat("to java"));

        //trim() remove spaces right and left side
        String u = "   welcome  ";
        System.out.println("before trimming"+u.length());
        System.out.println(u.trim());
        System.out.println("after trimming"+u.trim().length());

        //charAt() returns a character from a string based on index
        System.out.println(s.charAt(3));   //c
        System.out.println(s.charAt(0));   //w

        //contains()  true/false
        System.out.println(s1.contains("wel"));   //true
        System.out.println(s1.contains("come"));   //true
        System.out.println(s1.contains("Wel"));   //false
        System.out.println(s1.contains("COME"));   //false

        //equals() equalsIgnoreCase() compare strings
        String v = "welcome";
        System.out.println(s1==v); //true
        System.out.println(s1.equals(v));  //true
        System.out.println(s1.equals(("Welcome")));  //false
        System.out.println(s1.equalsIgnoreCase("Welcome")); //true

        //replace() replace single/multiple sequence of characters in a string
        String w = "welcome to selenium java selenium python selenium C#";
        System.out.println(w.replace("e","3")); //w3lcom3 to s3l3nium java s3l3nium python s3l3nium C#
        System.out.println(w.replace("selenium","playwright"));

        //substring() extracts a substring from a main String
        System.out.println(s1.substring(1,5));   //elco
        System.out.println(s1.substring(0,3));   //wel

        //toUpperCase()    toLowerCase
        System.out.println(s1.toLowerCase());   //welcome
        System.out.println(s1.toUpperCase());   //WELCOME

        //split() splits the strings into multiple parts based on a delimeter
        String t1 = "abc@gmail.com";
        String a[] = t1.split("@");
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);
        System.out.println(a[1]);

        //ex1
        String amount = "$15,20,55";
        System.out.println(amount.replace("$",""));
        System.out.println(amount.replace("$","").replace(",",""));

        //Ex2
        String email = "abc,123@xyz";
        String arr1[] = email.split(",");
        String arr2[] = arr1[1].split("@");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);


        //Ex3
        String t2 = "abc 123";
        String arr3[] = t2.split(" ");
        System.out.println(Arrays.toString(arr3));
        //* % ^ @ & ( ) cannot be used a delimeters


        //Ex4
        String name = "John Kennedy";
        System.out.println(name.contains("john"));    //false
        System.out.println(name.toLowerCase().contains("john"));  //true


    }
}
