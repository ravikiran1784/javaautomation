package day2;

public class AssignmentForDay2 {

       public static void main(String[] args) {
              // 1) print hello and name in separate line
              System.out.println("Hello");
              System.out.println("Ravi kiran");

              // 2)  print the sum of 2 numbers
              int a = 10;
              int b= 20;
              int sum = a + b;
              System.out.println("sum:" +sum);

              //3) swapping 2 numbers using third variable
              int k = 10;
              int o = 20;
              System.out.println("before swapping values are.. " +k+" "+o);

              int t = k;
              k = o;
              o = t;
              System.out.println("after swapping values are.. " +k+" " +o);


              //4) swapping numbers (without) using third variables
              int q = 30;
              int w = 40;
              System.out.println("before swapping values are.." +q+" " +w);

              q=q+w; //30+40 = 70 is q value
              w=q-w; //70-40 = 30 is w value
              q=q-w; //70-30 = 40 is q value

              System.out.println("after swapping values are.." +q+" " +w);



       }

}
