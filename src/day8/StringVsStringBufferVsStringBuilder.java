package day8;

public class StringVsStringBufferVsStringBuilder
{
    public static void main(String[] args)
    {
        //String mutable
        String s = "Welcome";
        s.concat("to java");
        System.out.println(s);  //immutable cannot change original value of s

        //StringBuffer - mutable
        StringBuffer sbf = new StringBuffer("welcome");
        sbf.append("to java");
        System.out.println(sbf);  //mutable we can change the original value

        //StringBuilder - mutable
        StringBuffer sbd = new StringBuffer("welcome");
        sbd.append("to java");
        System.out.println(sbd);  //mutable we can change the original value
    }
}
