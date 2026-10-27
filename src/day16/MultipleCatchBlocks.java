package day16;

public class MultipleCatchBlocks {
    public static void main(String[] args)
    {
        System.out.println("Program is started ");

        //example4
        String s1 = null;
        try
        {
            System.out.println(s1.length());     //NullPointerException if s1  is null
        }
        catch (NullPointerException e)
        {
            System.out.println("Handled Exception.....");
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Handled Exception.....");
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Handled Exception.....");
            System.out.println(e.getMessage());
        }
        catch (Exception e)                   //used when you don't know the specific exception
        {                                     //that will show up
            System.out.println("Handled Exception.....");
            System.out.println(e.getMessage());
        }
        System.out.println("Program is completed....");
        System.out.println("Program is exited....");

    }
}
