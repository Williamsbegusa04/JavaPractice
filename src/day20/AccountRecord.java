package day20;

public record AccountRecord(String number , String name ,String type, double balance)
{
    public boolean isOverDrawn()
    {
        return balance<0;
    }
}
