package day19;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations
    { public static void main(String[] args)
        {
            //Typed declaration: keys are account numbers (String), values are balances (Double)
            Map<String, Double> balances = new HashMap<>();

            //put: adds a pair, or replaces the value if the key already exists
            balances.put("1001", 50000.0);
            balances.put("1002", 12000.0);
            balances.put("1003", 75000.5);
            balances.put("1002", 15000.0);                 //same key, so the value is replaced
            System.out.println(balances);
            System.out.println("Size: " + balances.size());

            //get: returns the value, or null if the key does not exist
            System.out.println(balances.get("1001"));      //50000.0
            System.out.println(balances.get("9999"));      //null

            //getOrDefault: returns a value you choose when the key is missing
            System.out.println(balances.getOrDefault("9999", 0.0));    //0.0

            //containsKey and putIfAbsent
            System.out.println(balances.containsKey("1003"));          //true
            balances.putIfAbsent("1003", 1.0);             //key exists, nothing changes
            balances.putIfAbsent("1004", 8000.0);          //key is new, pair is added

            //remove
            balances.remove("1002");

            //Iterating over entries: each entry holds one key and one value
            for (Map.Entry<String, Double> entry : balances.entrySet())
            {
                System.out.println(entry.getKey() + " has " + entry.getValue());
            }

            //Counting words with getOrDefault
            String sentence = "the cat and the dog and the bird";
            Map<String, Integer> wordCount = new HashMap<>();
            for (String word : sentence.split(" "))
            {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            System.out.println(wordCount);
        }
    }

