package day10;

public class Greetings {
    //Different types of methods
    //1) no params no return value
    void m1()
    {
        System.out.println("hello...");
    }

    //2) no params returns value
    String m2()
    {
        return("Hello how are you...");
    }

    //3)Params no return value
    void m3(String name)
    {
        System.out.println("Hello "+name);
    }

    //4)Params return value
    String m4(String name)
    {
        return("Hello "+name);
    }
}
