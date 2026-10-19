package day3;

public class NestedIfStatement {
    public static void main(String[] args) {
        if(false)
        {
            if(true)
            {
                System.out.println("abc");
            }
            else
            {
                System.out.println("xyz");
            }
        }
        else
        {
            System.out.println("123");
        }
    }
}
