package CodingChallenges;

public class DigitalRoot {

    public static int digitalRoot(int num) {
        int result = 0;

        String numStr = Integer.toString(num);

        String [] numStrArr = numStr.split("");

        for (int i = 0; i < numStrArr.length; i++) {
            int number = Integer.parseInt(numStrArr[i]);
            result += number;
        }

        if (result > 9) {
            result = digitalRoot(result);
        }

        return result;
    }

}
