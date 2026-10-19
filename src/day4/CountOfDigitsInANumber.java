package day4;

public class CountOfDigitsInANumber {
    public static void main(String[] args)
    {
        int number = 4444444;
        int digit_count = 0;

        while(number!=0)
        {
            number = number/10;
            digit_count++;
        }
        System.out.println("The number has "+digit_count+"digits");
    }
}
