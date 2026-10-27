package day14;

interface Shape
{
    int length = 10;
    int width = 20;

    void circle();

    default void square()
    {
        System.out.println("This is Square() a  default method");
    }
    static void rectangle()
    {
        System.out.println("This is rectangle() a  default method");
    }


}

public class Interfacedemo implements Shape
{
    int x = 10;
    int y = 20;
    public void circle()
    {
        System.out.println("This is circle an abstract method");
    }
    void triangle()
    {
        System.out.println("This is triangle");
    }

    public static void main(String[] args)
    {
        //scenario 1
        Interfacedemo id = new Interfacedemo();
        id.circle();  //abstract method
        id.square(); // default method
        id.triangle();  // class native method for class interfacedemo data types

        Shape.rectangle();  //static method can directly be accessed from interface


        //scenario2
        Shape sh = new Interfacedemo();
        sh.circle();     // abstract method
        sh.square();     //default method
        //sh.triangle();      // can't call method because data type is an interface while  the
        // object type is the class which the method belongs too
        Shape.rectangle();  //static method can directly be accessed from interface

        System.out.println("Area of the shape is "+(Shape.length*Shape.width));//accessing static variables directly
        //System.out.println(sh.x+sh.y); //can't access Interfacedemoclass local variables cause datatype is not Interfacedemo

    }
}
