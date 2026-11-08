package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableComparatorDemo
{
    public static void main(String[] args)
    {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("1003", "Chidi", "Savings", 75000.50));
        accounts.add(new Account("1001", "Ada", "Savings", 50000));
        accounts.add(new Account("1004", "Dayo", "Current", -5000));
        accounts.add(new Account("1002", "Bola", "Current", 12000));

        //1. Comparable: Collections.sort() uses compareTo(), so lowest balance comes first
        Collections.sort(accounts.reversed());
        System.out.println("Sorted by balance:");
        for (Account a : accounts)
        {
            System.out.println(a);
        }
        System.out.println();
        //2. Comparator: sort by name using the separate comparator class
        accounts.sort(new AccountNameComparator());
        System.out.println("Sorted by name A to Z:");
        for (Account a : accounts)
        {
            System.out.println(a);
        }
        System.out.println();
        //3. reversed() flips any comparator
        accounts.sort(new AccountNameComparator().reversed());
        System.out.println("Sorted by name Z to A:");
        for (Account a : accounts)
        {
            System.out.println(a);
        }
        System.out.println();
        //4. Comparator: sort by account type  using the separate comparator class
        accounts.sort(new AccountTypeComparator());
        System.out.println("Sorted by account type  Savings or Current ");
        for (Account a : accounts)
        {
            System.out.println(a);
        }
    }
}
