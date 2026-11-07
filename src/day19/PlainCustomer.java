package day19;

public class PlainCustomer {
    private String accountNumber;
    private String name;

    public PlainCustomer(String accountNumber, String name)
    {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name + " (" + accountNumber + ")";
    }
}
