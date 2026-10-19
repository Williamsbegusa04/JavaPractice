package day4;

public class SumOfDigitsInANumber {
    public static void main(String[] args)
    {
        int number = 7760944;
        int sum_of_digits = 0;

        while(number!=0)
        {
            sum_of_digits+=(number%10);
            number = number/10;
        }
        System.out.println(sum_of_digits);

    }
}
