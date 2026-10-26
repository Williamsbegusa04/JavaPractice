package day13;

public class Dog extends Animal {
    String color = "Black";
    void displaycolor()
    {
        System.out.println(super.color);
    }
    void eat()
    {
        super.eat();
        System.out.println("eating bread......");
    }
}
