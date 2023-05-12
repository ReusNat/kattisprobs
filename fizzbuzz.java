/*
 * The classic FizzBuzz problem
 *
*/

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Fizz num: ");
        int x = s.nextInt();
        System.out.println("Buzz num: ");
        int y = s.nextInt();
        System.out.println("Num nums: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % x == 0 && i % y == 0)
                System.out.println("FizzBuzz");
            else if (i % x == 0)
                System.out.println("Fizz");
            else if (i % y == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
