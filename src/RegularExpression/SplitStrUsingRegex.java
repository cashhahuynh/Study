package RegularExpression;

public class SplitStrUsingRegex {

    public static String[] splitStrUsingRegex() {

        String str = "abcd";
        str = (str.length() % 2 == 0) ? str : str + "_";
        return str.split("(?<=\\G.{2})");

    }

}
