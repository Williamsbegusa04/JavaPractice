package day20;

import java.util.HashSet;
import java.util.Set;

public class RecordDemo
{
    public static void main(String[] args)
    {
        AccountRecord r1 = new AccountRecord("1001", "Ada", "Savings",50000);
        AccountRecord r2 = new AccountRecord("1001", "Ada", "Savings",50000);
        AccountRecord r3 = new AccountRecord("1004", "Dayo", "Current",-5000);

        //toString() is created for you
        System.out.println(r1);

        //Getters are named after the field, with no "get"
        System.out.println(r1.name());
        System.out.println(r1.balance());

        //equals() compares the content, so no manual equals() or hashCode() is needed
        System.out.println(r1.equals(r2));             //true
        System.out.println(r1 == r2);                  //false

        Set<AccountRecord> set = new HashSet<>();
        set.add(r1);
        set.add(r2);
        System.out.println("Set size: " + set.size());    //1

        //Your own method
        System.out.println(r3.isOverDrawn());          //true

        //Records are immutable: there are no setters, so the values can never change
    }
}
