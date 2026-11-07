package day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetUniqueness {
    public static void main(String[] args)
    {
        //declaration this hash set holds only strings
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Ada"));
        System.out.println(names.add("Bola"));
        System.out.println(names.add("Ada"));   //duplicate false
        System.out.println(names);
        System.out.println("Size of set is : "+names.size());

        //contains and remove
        System.out.println(names.contains("Bola"));
        names.remove("Bola");
        System.out.println(names.contains("Bola"));
        names.add("Chidi");

        //remove duplicates from a list
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,4,7,3,3,6));
        Set<Integer> unique = new HashSet<>(numbers);
        System.out.println("List :"+numbers);
        System.out.println("Unique : "+unique);

        //use a set to reject duplicates
        Set<String> accountNumber = new HashSet<>();
        String[] newAccounts = {"10001","10002","10003","10001","10003"};

        for (String number : newAccounts)
        {
            if(accountNumber.add(number))
            {
                System.out.println("Account "+number+" Created");
            }
            else
            {
                System.out.println("Account number  "+number+" already exists");
            }
        }
        System.out.println(names);

    }
}
