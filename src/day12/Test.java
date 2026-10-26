package day12;

public class Test {
    static class X {

    }

    public static void main(String[] args) {
        X xobj = new X();


        //Due to the presence of inherited methods from the Object class which is the root class
        // for all java classes if you perform a multiple inheritance there will be ambiguity due to
        // duplicate classes so java classes  doesn't support multiple inheritances . Interfaces do that.
    }
}
