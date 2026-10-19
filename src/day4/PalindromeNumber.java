package day4;

public class PalindromeNumber {
    public static void main(String[] args)
    {
        int number = 1234321;
        int original_number =number;
        int reverse_number = 0;
       //reverse the number
        while(number!=0)
        {
            reverse_number = (reverse_number*10)+(number%10);
            number = number/10;
        }

        //check if number is a palindrome
        if(original_number == reverse_number)
        {
            System.out.println("The number is a palindrome "+reverse_number);
        }
    }
}
