package day4;

public class AssignCompareString {
    public static void main(String[] args) {
        String str1 = "example.com" , str2 = "Example.com";
        CharSequence cs = "example.com";

        System.out.println("comparing " +str1+" and " +cs+": " +str1.contentEquals (cs));
        System.out.println( "comparing " +str2+" and " +cs+": " +str2.contentEquals(cs));

    }
}
