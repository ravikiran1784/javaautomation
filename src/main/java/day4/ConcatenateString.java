package day4;

public class ConcatenateString {
    public static void main(String[] args) {
        String str1 = "PHP Exercises  and ";
        String str2 = "Python Exercises";

        System.out.println("string 1:" +str1);
        System.out.println("String 2 :" +str2);

        //concatenate the two strings together
        String str3 = str1.concat(str2);

        //display the new string
        System.out.println("The concatenated String:" +str3);
    }

}
