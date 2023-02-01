package CodingChallenges;

import java.util.Scanner;

public class FibonacciSequence {

    //use for loop in main method with iterator variable starting at 1
    public static int fibonacciSequence(int num) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please provide a number for end of fibonacci sequence: ");
//        Integer num = scanner.nextInt();
//        scanner.close();

        if (num == 1 || num == 2) {
            return 1;
        }

        Integer fibonacci = 1, fibo1 = 1, fibo2 = 1;
        for(int i = 3; i <= num; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }

}
