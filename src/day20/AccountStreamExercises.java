package day20;

import java.util.*;
import java.util.stream.Collectors;

public class AccountStreamExercises
{
    public static void main(String[] args)
    {
        List<Account> accounts = List.of(
                new Account("1001", "Ada", "Savings", 50000),
                new Account("1002", "Bola", "Current", 12000),
                new Account("1003", "Chidi", "Savings", 75000.50),
                new Account("1004", "Dayo", "Current", -5000),
                new Account("1005", "Ese", "Savings", 20000),
                new Account("1006", "Femi", "Current", 30000));

        //Exercise 1: total balance of all accounts
        double total_balance = accounts.stream().map(Account::getBalance).reduce(0.0,(a,b)->a+b);
        System.out.println("1. The total balance of all accounts is: "+total_balance);

        //Exercise 2: names of accounts with a balance above 25000
        List<String> names_25k = accounts.stream().filter(a -> a.getBalance() > 25000)
                .map(Account::getName)
                .collect(Collectors.toList());
        System.out.println("2. Above 25000: "+names_25k);

        //Exercise 3: names sorted from Z to A
        List<String> names_sortedZA = accounts.stream().map(Account::getName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("3. Names Z to A: "+names_sortedZA);

        //Exercise 4: a list of all account numbers
        List<String> account_numbers = accounts.stream().map(Account::getNumber)
                .collect(Collectors.toList());
        System.out.println("4. Account numbers: "+account_numbers);

        //Exercise 5: the account with the highest balance
        Optional<Account> richest = accounts.stream().max(Comparator.comparing(Account::getBalance));
        richest.ifPresent(a->System.out.println("5. Richest: "+a));


        //Exercise 6: how many accounts are overdrawn (balance below 0)
        long overdrawn = accounts.stream().filter(a->a.getBalance()<0).count();
        System.out.println("6. Overdrawn accounts: "+overdrawn);

        //Exercise 7: the average balance, to 2 decimal places
        OptionalDouble average_balance = accounts.stream().mapToDouble(Account::getBalance)
                .average();
        average_balance.ifPresent(avg-> System.out.println("7. Average balance: "+avg));

        //Exercise 8: is any account overdrawn, and do all accounts have a positive balance
        boolean anyOverdrawn = accounts.stream().anyMatch(a -> a.getBalance() < 0);
        boolean allPositive = accounts.stream().allMatch(a -> a.getBalance() > 0);
        System.out.println("8. Any overdrawn: " + anyOverdrawn + ", all positive: " + allPositive);


        //Exercise 9: all names in one line, separated by commas
        String joined = accounts.stream()
                .map(Account::getName)
                .collect(Collectors.joining(","));
        System.out.println("9. Names: " + joined);

        //Exercise 10: how many accounts of each type
        Map<String, Long> countByType = accounts.stream()
                .collect(Collectors.groupingBy(Account::getType, Collectors.counting()));
        System.out.println("10. Count by type: " + countByType);

    }
}
