package day8;

public class RemoveSpecialCharactersInAString {
    public static void main(String[] args)
    {
        String s = "!%%begusa_ let's go %@";
        //approach1
        String cleaned_s =s.replaceAll("[^a-zA-z0-9\\s]","");
        System.out.println(cleaned_s);
        //approach2
        String clean_s = s.replaceAll("[^\\w\\s]","");
        System.out.println(clean_s);
    }
}
