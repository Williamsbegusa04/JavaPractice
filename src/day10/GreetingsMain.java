package day10;

public class GreetingsMain {
    public static void main(String[] args)
    {
        Greetings gr = new Greetings();
        gr.m1();
        String s = gr.m2();
        System.out.println(s);
        //alternatively
        System.out.println(gr.m2());
        gr.m3("Emor");

        String st = gr.m4("David");
        System.out.println(st);
    }
}
