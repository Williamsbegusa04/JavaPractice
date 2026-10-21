package day8;

public class CountOfWordsInAString {
    public static void main(String[] args)
    {
        String s = "hello my bro are you good   ";
        int word_count =0;
        //check if string is empty
        if(!s.isEmpty())
        {

            for(int i = 0;i<s.length()-1;i++)
            {
                if(s.charAt(i)!=' ')
                {
                    if(i==0||s.charAt(i-1)==' ')
                    {
                        word_count++;
                    }
                }
            }
        }
        else
        {
            System.out.println("This is an empty String");
        }
        System.out.println(word_count);
    }
}
