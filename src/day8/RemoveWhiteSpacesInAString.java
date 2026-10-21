package day8;

public class RemoveWhiteSpacesInAString {
    public static void main(String[] args)
    {
        String s = "Begusa williams is a bad boy    ";
        //approach1
        String cleaned_s =s.replaceAll("[\\s]","");
        System.out.println(cleaned_s);

    }
}
