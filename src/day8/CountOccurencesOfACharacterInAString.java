package day8;

public class CountOccurencesOfACharacterInAString {
    public static void main(String[] args)
    {
        String s = "wetin dey sup my guyy   ";
        int count = 0;
        char check = 'y';

        for(int i = 0; i<s.length();i++)
        {
            if(s.charAt(i)==check)
            {
                count++;
            }

        }
        if(count>0)
        {
            System.out.println("This "+check+" occurs "+count+" number of times");
        }
        else
        {
            System.out.println(check+" does not occur in the string");
        }
    }
}
