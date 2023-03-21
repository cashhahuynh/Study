package CodingChallenges;

public class ReverseWordsInString {

    public static String reverseWordsInString(String str) {
        //String str = "Happy New Year, Cashlynn!";
        String [] strSplit = str.trim().split("\\s");
        StringBuilder sb = new StringBuilder();

        for (int i = strSplit.length - 1; i >= 0; i--) {
            sb.append(strSplit[i] + " ");
        }

        System.out.println(sb.toString());
        return sb.toString().trim();
    }

}
