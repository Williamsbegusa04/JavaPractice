package day8;

public class CheckAStringIsPalindrome {
    public static void main(String[] args)
    {
        String s = "Racecar";


        //reverse the string
        StringBuilder sbd = new StringBuilder(s.toLowerCase());
        String reverse = sbd.reverse().toString();


        if(reverse.equalsIgnoreCase(s))
        {
            System.out.println("The String is a palindrome: "+s+" & "+reverse);
        }
        else
        {
            System.out.println("Not a palindrome");
        }

    }
}
