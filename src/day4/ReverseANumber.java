package day4;

public class ReverseANumber {
    public static void main(String[] args)
    {
        int number = 14567888;
        int reverse_number = 0;
        while(number!=0)
        {
            reverse_number = (reverse_number*10)+(number%10);
            number = number/10;
        }
        System.out.println("The number reversed is; "+reverse_number);
    }
}
