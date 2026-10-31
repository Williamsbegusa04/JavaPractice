package day18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetdDemo {
    public static void main(String[] args)
    {
        //Declaration
        HashSet myset = new HashSet();
        //alternatively
        /*Set myset = new Hashset();
        HashSet<Integer> myset = new HashSet<Integer>();
        HashSet<Employee> myset = new HashSet<Employee>();*/
        // These are all other methods of declaring an HashSet

        //adding Elements to HashSet
        myset.add(100);                             //accepts heterogenous data
        myset.add(10.5);                            //doesn't  accept duplicate
        myset.add("Welcome");                       // accepts null values only one
        myset.add(true);                            // index order is  not preserved
        myset.add(100);
        myset.add(null);
        myset.add(null);
        myset.add("Welcome");
        myset.add("Welcome");

        System.out.println(myset);      // no duplicates were added [null, 100, 10.5, Welcome, true

        // size of asn HaashSet
        System.out.println("The size of the HashSet: "+myset.size());

        //removing element from an HashSet
        myset.remove(10.5);                     //takes the value of the actual object not the index
        System.out.println("After removing: "+myset);


        //inserting elements is not possible for hash collections
        //accessing specific elements not possible in hash collections
        //work around would be to convert the hashset into an arraylist
        ArrayList al = new ArrayList (myset);
        System.out.println(al.get(3));

        //Reading all the elements in the arrayList
        //using for loop - cannot be used for unindexed hash collections
        //using for each loop
        System.out.println("Using enhanced for loop");
        for(Object value :myset)
        {
            System.out.println(value);
        }
        //using Iterator
        Iterator it = myset.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //clearing all the elements from a HashSet
        myset.clear();
        System.out.println("After clearing: "+myset);




    }

}
