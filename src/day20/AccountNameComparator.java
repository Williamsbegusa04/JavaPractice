package day20;

import java.util.Comparator;

public class AccountNameComparator implements Comparator<Account> {
    @Override
    public int compare(Account a, Account b)
    {
        return a.getName().compareTo(b.getName());
    }
}
