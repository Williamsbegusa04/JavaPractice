package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args)
    {
        //Declaration
        HashMap hm = new HashMap();
        /*HashMap <Integer,String> hm = new HashMap<Integer,String>();
        HashMap <Employee<Integer,String>> hm = new HashMap<Employee<Integer,String>>();
        Map mymap = new HashMap();*/

        //adding pairs
        hm.put(101,"John");                     //Data  is stored in key, value pairs
        hm.put(102,"Scott");                    // Keys are always unique ,but we can have duplicate values
        hm.put(103,"Mary");                     // index Order is nor preserved
        hm.put(104,"Scott");
        hm.put(102,"David");                    // since the key is repeated the value for key 102 will be updated

        System.out.println(hm);

        //Size of a hashmap
        System.out.println("Size of hashmap: "+hm.size());        //4

        //remove pairs
        hm.remove(103);            //103 is the key of the key,value pair
        System.out.println("After removing pairs: "+hm);

        //access the value of the key
        System.out.println(hm.get(102));

        //get all the keys from hashmap
        System.out.println(hm.keySet());         //all keys
        System.out.println(hm.values());         //all values
        System.out.println(hm.entrySet());       //all key value pairs

        //Reading data from Hashmap
        //using for loop  not possible for hash collections
        //using for each loop
        for (Object values:hm.keySet())
        {
            System.out.println(values+" "+hm.get(values));
        }
        //Using iterator
        System.out.println("Using Iterator");
        Iterator <Map.Entry<Integer,String>>it = hm.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey()+"     "+entry.getValue());
        }


        //clearing hashmap
        hm.clear();
        System.out.println("After clearing : "+hm);






    }
}
