package day20;

import java.util.Comparator;

public class AccountTypeComparator implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
