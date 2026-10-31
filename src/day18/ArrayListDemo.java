package day18;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Declaration
        ArrayList mylist = new ArrayList();
        //alternatively
        /*List mylist = new ArrayList();
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        ArrayList<Employee> mylist = new ArrayList<Employee>();*/
        // These are all other methods of declaring an ArrayList

        //Adding data  into ArrayList
        mylist.add(100);                             //accepts heterogenous data
        mylist.add(10.5);                            // accepts duplicates
        mylist.add("Welcome");                       // accepts null values
        mylist.add(true);                            // index order is preserved
        mylist.add(100);
        mylist.add(null);
        mylist.add(null);


        //size of an arrayList
        System.out.println("Size of an ArrayList: "+mylist.size());

        //printing an arrayList
        System.out.println("Printing data from ArrayList: "+mylist);

        //remove element from an arrayList
        mylist.remove(5);      // it accepts the index of the element to be removed
        System.out.println("After removing: "+mylist);

        //insert element into an arrayList  -adds an element to the arraylist at any index specified
        mylist.add(2,"Java");
        System.out.println("After insertion: "+mylist);

        // Modify / change/replace an element in  the arrayList
        mylist.set(2,"Python");
        System.out.println("After modification: "+mylist);

        //access specific element in the arraylist using the index
        System.out.println(mylist.get(3));

        //Reading all the elements in the arrayList
        //using for loop
        System.out.println("Using normal for loop");
        for(int i = 0 ; i <mylist.size()-1;i++)
        {
            System.out.println(mylist.get(i));
        }
        //using for each loop
        System.out.println("Using enhanced for loop");
        for(Object value :mylist)
        {
            System.out.println(value);
        }
        //using iterator
        System.out.println("Using iterator");
        Iterator it = mylist.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        //Checking if arrayList is empty
        System.out.println("Is array List empty true or false: "+mylist.isEmpty());

        //remove group of elements from Arraylist
        ArrayList mylist2 = new ArrayList();
        mylist2.add(100);
        mylist2.add(null);
        mylist2.add("Welcome");

        mylist.removeAll(mylist2);
        System.out.println("After removing "+mylist);

        //clear all the elements from an arrayList
        mylist.clear();
        System.out.println("Is array List empty true or false: "+mylist.isEmpty());    //true




    }
}
