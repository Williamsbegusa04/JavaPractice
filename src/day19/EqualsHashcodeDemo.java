package day19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualsHashcodeDemo {
    public static void main(String[] args)
    {
        //PART 1: a class WITHOUT equals() and hashCode()
        PlainCustomer p1 = new PlainCustomer("1001", "Ada");
        PlainCustomer p2 = new PlainCustomer("1001", "Ada");   //same details, different object

        System.out.println(p1 == p2);                 //false, different objects in memory
        System.out.println(p1.equals(p2));            //false, equals() defaults to ==

        Set<PlainCustomer> plainSet = new HashSet<>();
        plainSet.add(p1);
        plainSet.add(p2);
        System.out.println("Plain set size: " + plainSet.size());       //2, the duplicate got in

        Map<PlainCustomer, String> plainMap = new HashMap<>();
        plainMap.put(p1, "Savings");
        System.out.println(plainMap.get(p2));         //null, the map can't find the same customer

        //PART 2: a class WITH equals() and hashCode()
        Customer c1 = new Customer("1001", "Ada");
        Customer c2 = new Customer("1001", "Ada");

        System.out.println(c1 == c2);                 //false, still two objects
        System.out.println(c1.equals(c2));            //true, equal by content
        System.out.println(c1.hashCode() == c2.hashCode());     //true

        Set<Customer> customerSet = new HashSet<>();
        customerSet.add(c1);
        customerSet.add(c2);
        System.out.println("Customer set size: " + customerSet.size());   //1

        Map<Customer, String> customerMap = new HashMap<>();
        customerMap.put(c1, "Savings");
        System.out.println(customerMap.get(c2));      //Savings
    }
}
