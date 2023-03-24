package CodingChallenges;

import java.util.Scanner;

public class SquareRoot {

    public static String squareRoot() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a number to find its square root: ");
        Double num = scanner.nextDouble();
        scanner.close();

        String answer = returnSquareRoot(num);
        return answer;

    }

    public static String returnSquareRoot(double num) {

        Double answer = Math.sqrt(num);
        String returnAnswer = String.format("The square root of %f is %f", num, answer);

        return returnAnswer;

    }

}
