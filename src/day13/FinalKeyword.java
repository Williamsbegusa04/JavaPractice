package day13;

class Test
{
    final int x = 100;
}

public class FinalKeyword {
    public static void main(String[] args)
    {
        Test t = new Test();
        //t.x = 90;     // immutable cause of final keyword


    }
}
