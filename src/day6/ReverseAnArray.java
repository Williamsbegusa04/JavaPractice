package day6;

public class ReverseAnArray {
    public static void main(String[] args)
    {
        int a[] = {100,200,300,400,500};
        System.out.print("[");
        for(int i = a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+", ");
        }
        System.out.print("]");
    }
}
