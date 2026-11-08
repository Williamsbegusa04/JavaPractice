package day20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdasDemo
{
    public static void main(String[] args)
    {
        //A lambda is a short way to write the one method of a functional interface
        //Syntax: (parameters) -> result
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        Calculator substract = (int a, int b) -> a - b;
        System.out.println(add.calculate(5, 3));                //8
        System.out.println(multiply.calculate(5, 3));           //15
        System.out.println(substract.calculate(20,19));         //1

        //Java already has common functional interfaces
        Function<String, Integer> lengthOf = s -> s.length();   //takes a value, returns another value
        Predicate<Integer> isEven = n -> n % 2 == 0;            //takes a value, returns true or false
        Consumer<String> greeter = s -> System.out.println("Hello " + s);   //takes a value, returns nothing

        System.out.println(isEven.test(10));                    //true
        System.out.println(isEven.test(7));                     //false
        System.out.println(lengthOf.apply("Williams"));         //8
        greeter.accept("Ada");

        //Lambdas with collections
        List<String> names = new ArrayList<>(List.of("Chidi", "Ada", "Bola","Williams" ));
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);                     //method reference, same result

        //Same job as AccountNameComparator, written in one line
        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);

        //removeIf takes a Predicate
        names.removeIf(name -> name.startsWith("A"));
        System.out.println(names);

        Predicate<String> isLong =  word -> word.length()>5;
        System.out.println(isLong.test("Williams"));   // true, 8 letters
        System.out.println(isLong.test("Ada"));        // false, 3 letters

        names.removeIf(isLong);
        System.out.println(names);

    }
}
