package day2;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators===>  +  -  /   *  %

        int a = 90;
        int b = 99;

        System.out.println("sum:" +(a+b));  //concatination
        System.out.println("sub:" +(a-b));
        System.out.println("mul:" +(a*b));
        System.out.println("div:" +(a/b));
        System.out.println("mod :" +(a%b));


        //Relational operators(comparison Operators)  ==>>, ==, <,  >,  <==,  >==, !=
        // Always return Boolean value

        System.out.println(a == b);
        System.out.println(a<b);
        System.out.println(a > b );
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b );


        //anotherway to solve
        int sum = a+b;
        System.out.println("sum:" +sum);








    }





}
