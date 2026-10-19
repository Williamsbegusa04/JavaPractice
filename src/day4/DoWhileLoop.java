package day4;

public class DoWhileLoop {
    public static void main(String[] args)
    {
        int i = 1;

        //Ex1 print1-10
        do
        {
            System.out.println(i);
            i++;
        }while(i<=10);

        //Ex2 print 10-1
        int j = 10;
        do
        {
            System.out.println(j);
            j--;

        }while(j>=1);

    }
}
