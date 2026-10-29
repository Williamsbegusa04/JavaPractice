package day17;

public class TypeCastingObject {
    public static void main(String[] args)
    {
//        Object o = new String("Welcome");
//        StringBuffer sb = (StringBuffer) o;            //valid rule 1 , 2 , invalid rule 3

//        String s = new String("Welcome");
//        StringBuffer sb = (StringBuffer) s;            //invalid rule 1

//        Object o = new String("Welcome");
//        StringBuffer sb = (StringBuffer) o;           //valid rule 1 , 2 , invalid rule 3

//        Object o = new String("Welcome");
//        StringBuffer sb = (String) o;                   //valid rule 1 , invalid rule 2

//        String s = new String("Welcome");
//        StringBuffer sb = (String) s;                         //valid rule 1,invalid rule2

//        Object o = new String("Welcome");
//        StringBuffer sb = (StringBuffer) o;                   //valid rule 1 ,2,invalid rule 3

        Object o = new String("Welcome");
        String s = (String) o;                                     //valid rule 1,2,3

        System.out.println(s);
    }
}
