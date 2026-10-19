package day4;

public class WhilevsDowhileLoop
{
    public static void main(String[] args)
    {
        //while loop
        int i =10;
        while(i<=5)
        {
            System.out.println(i);    //no output
            i++;
        }

        //do-while loop
        int j = 10;
        do
        {
            System.out.println("while loop "+j);    //This statement will run at least once
            j++;
        }while(j<=5);
    }
}
