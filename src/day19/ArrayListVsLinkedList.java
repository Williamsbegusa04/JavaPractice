package day19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args)
    {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("Ada");
        arrayList.add("Bola");
        arrayList.add("Chidi");
        linkedList.add("Ada");
        linkedList.add("Bola");
        linkedList.add("Chidi");

        System.out.println("ArrayList : "+arrayList);
        System.out.println("LinkedList : "+linkedList);

        //get by index
        System.out.println(arrayList.get(1));
        System.out.println(linkedList.get(1));

        //insert at the front
        arrayList.add(0,"Zara");
        linkedList.add(0,"Zara");

        System.out.println("after inserting at the front ArrayList : "+arrayList);
        System.out.println("after inserting at the front LinkedList : "+linkedList);

        //Linked list extra methods for working at both ends of the list
        LinkedList<String> queue = new LinkedList<>();
        queue.add("first customer");
        queue.add("second customer");
        queue.addFirst("Vip Customer");
        System.out.println(queue.getFirst());   //vip customer
        System.out.println(queue.getLast());    //second customer
        System.out.println(queue.removeLast());
        System.out.println("after removing at the front LinkedList : "+queue);

        //speed Test insert 100000 in front of each list
        List<Integer>  bigArrayList = new ArrayList<>();
        List<Integer>  bigLinkedList = new LinkedList<>();

        long start = System.nanoTime();
        for(int i=0;i<=100000;i++)
        {
            bigArrayList.add(0,i);
        }
        long arrayListTime = (System.nanoTime()-start)/1000000;

        start = System.nanoTime();
        for(int i=0;i<=200000;i++)
        {
            bigArrayList.add(0,i);
        }
        long linkedListTime = (System.nanoTime()-start)/1000000000;


        System.out.println("ArrayList took : "+arrayListTime+" s");
        System.out.println("LinkedList took : "+linkedListTime+" s");


    }

}
