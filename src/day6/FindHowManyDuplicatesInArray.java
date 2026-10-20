package day6;

public class FindHowManyDuplicatesInArray {
    public static void main(String[] args)
    {
        int a[] = {100,200,100,300,400,100,200};
        int count = 0;
        int num = 200;
        for(int x : a)
        {
            if(x==num)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
