package day20;

import java.util.List;
import java.util.stream.Collectors;

public class StreamBasics
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(5, 12, 8, 21, 3, 16);

        //A stream pipeline: source -> operations -> result
        //filter: keep only the items that pass the test
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Evens: " + evens);

        //map: change each item into something else
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        //sorted
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sorted);

        //reduce combine all items into one value
        int sum = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println("Sum: "+sum);

        //count
        long bigOnes = numbers.stream().filter(n -> n > 10).count();
        System.out.println("Numbers above 10: " + bigOnes);

        //Streams of Strings
        List<String> names = List.of("ada", "bola", "chidi");
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upper);

        //Chaining: keep evens, square them, then add them up
        int chained = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Sum of squares of evens: " + chained);

        //The original list is never changed
        System.out.println("Original: " + numbers);

        //filter numbers above 10  double each one, collect to a list
        List<Integer> bignumber = numbers.stream().filter(n-> n>10)
                .map(n -> n*2)
                .collect(Collectors.toList());
        System.out.println("Double the numbers above 10: "+bignumber);

        //use reduce to find the product of all the numbers
        long multiple = numbers.stream().reduce(1,(a,b)->a*b);
        System.out.println("The multiplication of all the numbers is : "+multiple);
    }
}
