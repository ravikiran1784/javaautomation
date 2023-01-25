package day4;

public class AssignFizzBuzz {

    public static void main(String[] args) {
        int n = 100;
        int i;

        for (i= 1; i <= n; i++) {

                System.out.println(i);
            }

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + "FizzBuzz");
            }

            if (i % 3 == 0) {
                System.out.println(i + "Fizz");
            }
            if (i % 5 == 0) {
                System.out.println(i + "Buzz");
            }

        }
        }