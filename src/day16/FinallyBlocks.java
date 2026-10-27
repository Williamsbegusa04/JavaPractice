package day16;

public class FinallyBlocks {
    public static void main(String[] args)
    {
        System.out.println("Program is started ");

        String s1 = "Welcome";
        try
        {
            System.out.println(s1.length());
        }
        catch(Exception e)
        {
            System.out.println("catch block handled Exception");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("You entered the finally block this will run no matter what ");
        }

        System.out.println("Program is completed....");
        System.out.println("Program is exited....");
    }
}
