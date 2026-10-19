package day4;

public class CountOfOddAndEvenDigits {
    public static void main(String[] args)
    {
        int number = 449135744;
        int even_count = 0;
        int odd_count = 0;

        while(number!=0)
        {
            int check_digit= number%10;  //getting the last digit from the number
            if(check_digit%2==0)         // checking if the digit is even or odd
            {
                even_count++;
            }
            else
            {
                odd_count++;
            }
            number = number/10;    //removing the last digit since it has been checked
        }
        System.out.println("The number has "+even_count+" even digits and "+odd_count+" odd digits");
    }
}
