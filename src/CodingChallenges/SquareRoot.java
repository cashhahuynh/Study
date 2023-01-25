package CodingChallenges;

import java.util.Scanner;

public class SquareRoot {

    public static void squareRoot() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide a number to find its square root: ");

        Double num = scanner.nextDouble();

        Double answer = Math.sqrt(num);

        System.out.printf("The square root of %f is %f", num, answer);

    }

}
