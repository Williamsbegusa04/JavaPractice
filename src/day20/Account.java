package day20;

//Comparable<Account> gives Account a "natural order": lowest balance first
public class Account implements Comparable<Account>
{
    private String number;
    private String name;
    private String type;
    private double balance;

    //Getters

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    //constructor
    public Account(String number,String name,String type,double balance)
    {
        this.number=number;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }


   //overriding existing compareTo method
    @Override
    public int compareTo(Account other)
    {
        return Double.compare(this.balance, other.balance);
    }

    @Override
    public String toString() {
        return name + " ( " +type+" ) "+ balance;
    }
}
