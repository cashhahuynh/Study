package CodingChallenges;

import java.util.Scanner;

public class FibonacciSequence {

    public static void fibonacciSequence() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number for end of fibonacci sequence: ");
        Integer num = scanner.nextInt();
        scanner.close();

        if (num == 1 || num == 2) {
            System.out.println(1);
        }

        Integer fibonacci = 1, fibo1 = 1, fibo2 = 1;
        for(int i = 3; i <= num; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.println(fibonacci);
        }
    }

}
