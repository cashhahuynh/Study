package CodingChallenges;

public class ReverseWordsInString {

    public static void reverseWordsInString() {
        String str = "Happy New Year, Cashlynn!";
        String [] strSplit = str.trim().split("\\s");
        StringBuilder sb = new StringBuilder();

        for (int i = strSplit.length - 1; i >= 0; i--) {
            sb.append(strSplit[i] + " ");
        }

        System.out.println(sb.toString());
    }

}
