package day20;

import java.util.List;



public class GenericsDemo
{
    //<T> before the return type makes this a generic method
    public static <T> void printAll(List<T> items)
    {
        for (T item : items)
        {
            System.out.println("Item: " + item);
        }
    }
    //T extends Comparable<T> means: any type that can be compared with compareTo()
    public static <T extends Comparable<T>> T largest(List<T> items)
    {
        T biggest = items.get(0);
        for (T item : items)
        {
            if (item.compareTo(biggest) > 0)
            {
                biggest = item;
            }
        }
        return biggest;
    }

    public static void main(String[] args)
    {
        //The same Box class  holds different types
        Box<String> nameBox = new Box<>("Ada");
        Box<Integer> numberBox = new Box<>(42);

        String name = nameBox.getItem();               //no casting needed
        int number = numberBox.getItem();
        System.out.println(name + " " + number);

        //Box<String> bad = new Box<>(42);     //will not work cause of wrong argument type

        //Generic methods
        List<String> names = List.of("Ada", "Bola", "Chidi");
        List<Integer> numbers = List.of(4, 9, 2);

        printAll(names);
        printAll(numbers);
        System.out.println(largest(numbers));          //9
        System.out.println(largest(names));            //Chidi

        List<Double> temperatures = List.of(10.5,20.2,35.6,34.2,3.1);
        System.out.println(largest(temperatures));

        Pair <String,Integer> p1 = new Pair<>("Ada",30);
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
    }
}
