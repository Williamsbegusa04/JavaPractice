package day17;
//Upcasting converting a value from smaller to a larger value
// int ------> long
//float -----> double
//doncasting
public class TypeCastingConcept {
    public static void main(String[] args)
    {
       //Upcasting , it is automatic
        int intvalue = 100;
        long longvalue = intvalue;
        System.out.println(longvalue);
        float floatvalue = 1000.56F;
        double doublevalue = floatvalue;
        System.out.println(doublevalue);


        //Downcasting has to be done manually  larger to smaller
         longvalue = 10000;
         intvalue = (int)longvalue;
        System.out.println(intvalue);
        doublevalue = 125.55;
        floatvalue = (float)doublevalue;


        //example1
        int i = 100;
        double d = i ;       //upcasting
        System.out.println(d);


        //example2
        double dd = 100000.5;
        float ff =(float)dd;             //downcasting
        System.out.println(dd);


    }
}
