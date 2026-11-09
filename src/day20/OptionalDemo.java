package day20;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalDemo
{
    public static void main(String[] args)
    {
        List<Account> accounts = List.of(
                new Account("1001", "Ada", "Savings", 50000),
                new Account("1002", "Bola", "Current", 12000),
                new Account("1003", "Chidi", "Savings", 75000.50));

        //Optional is a box that may or may not contain a value. It replaces returning null.
        Optional<Account> richest = accounts.stream()
                .max(Comparator.comparing(Account::getBalance));
        System.out.println(richest.isPresent());                //true
        richest.ifPresent(a -> System.out.println("Richest: " + a));

        //findFirst() on an empty result gives an empty Optional, not null
        Optional<Account> millionaire = accounts.stream()
                .filter(a -> a.getBalance() > 60000)
                .findFirst();
        System.out.println(millionaire.isPresent());            //false
        System.out.println(millionaire.orElse(null));           //null

        //map() works inside an Optional, orElse() gives a default
        String name = millionaire.map(Account::getName).orElse("nobody");
        System.out.println(name);

        //Optional.ofNullable wraps a value that might be null
        String maybeNull = null;
        Optional<String> wrapped = Optional.ofNullable(maybeNull);
        System.out.println(wrapped.isPresent());
    }
}
