package day8;

public class ReverseAString {
    public static void main(String[] args)
    {
        //Approach1  using .length() and at charAt()
        String s = "Welcome";
        String rev = "";

        for(int i = s.length()-1;i>=0;i--)
        {
            rev = rev+(s.charAt(i));
        }
        System.out.println(rev);

        //Approach 2 using String method tocharArray()
        String reverse = "";
        char a[] = s.toCharArray();

        for(int i =a.length-1;i>=0;i--)
        {
            reverse = reverse+a[i];
        }
        System.out.println(reverse);

        //Approach3 using StringBuffer class
        StringBuilder sbd = new StringBuilder(s);
        System.out.println(sbd.reverse());
    }
}
