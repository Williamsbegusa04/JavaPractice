package day19;

import java.util.Objects;

public class Customer {
    private String accountNumber;
    private String name;

    public Customer(String accountNumber, String name)
    {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    //Two customers are equal when their account number and name are equal
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer other = (Customer) o;
        return Objects.equals(accountNumber, other.accountNumber)
                && Objects.equals(name, other.name);
    }

    //Equal customers MUST produce the same hash code
    @Override
    public int hashCode()
    {
        return Objects.hash(accountNumber, name);
    }

    @Override
    public String toString()
    {
        return name + " (" + accountNumber + ")";
    }
}
