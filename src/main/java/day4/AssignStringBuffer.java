package day4;

public class AssignStringBuffer {

    public static void main(String[] args) {
        String str1 = "example.com" , str2 = "Example.com";
         StringBuffer strbuf = new StringBuffer(str1);

         System.out.println("comparing "+str1+" and "+strbuf+":  " + str1.contentEquals(strbuf));

         System.out.println("comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));
    }
}
