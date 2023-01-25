package day2;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;

        //logical operators ==>> && == ||
        // = is assigning operator
        //== is comparison operator

        System.out.println(x<y && x>10); //false
        System.out.println(x>y && y==10); // true
        System.out.println(x<10 || y==10); // true
        System.out.println(x<10 || y<20);//true
        System.out.println(x != y);//true
        System.out.println(x!=20);//false

        System.out.println(x<=y); //false
        System.out.println(x>=y); // true




    }
}
