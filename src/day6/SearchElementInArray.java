package day6;

public class SearchElementInArray {
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40,50};
        int search_element = 30;
        int search_number = 80;
        boolean status = false;
        boolean status2 = false;

        //Enhanced for loop
        for(int x : a)
        {
            if(x==search_element)
            {
                System.out.println("Number found ");
                status = true;
                break;
            }
        }
        if(status == false)
        {
            System.out.println("Number not found");
        }
        //normal for loop
        for(int i = 0;i<a.length;i++)
        {
            if(search_number==a[i])
            {
                System.out.println("Number found");
                status2 = true;
            }
        }
        if(status2==false)
        {
            System.out.println("number not found");
        }

    }
}
