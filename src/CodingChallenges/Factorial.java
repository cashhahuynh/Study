package CodingChallenges;

public class Factorial {

    public static int recursiveFactorial(int num) {
        int result;
        if (num == 1) {
            result = 1;
        } else {
            result = recursiveFactorial(num - 1) * num;
        }
        return result;
    }

}
