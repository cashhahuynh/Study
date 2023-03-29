package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {

    public static void patternAndMatcherBasics() {

        String regex = "[aeiou]";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Happy new year, Cashlynn!");

        System.out.println("Pattern that's being matched: " + matcher.pattern());
        System.out.println("matches returns false because it matches against whole text: " + matcher.matches());
        System.out.println("lookingAt returns false because it looks at beginning of text: " + matcher.lookingAt());

        boolean matchFound = matcher.find();

        if(matchFound) {
            System.out.println("\nThis string contains vowels:");
        } else {
            System.out.println("\nThis string does not contain vowels");
        }

        //reset method allows matcher to start from beginning of the text for additional usage
        matcher.reset();

        int counter = 0;
        while(matcher.find()) {
            counter ++;
            System.out.printf("\nvowel #%d found: " + matcher.start() + "-" + matcher.end(), counter);
        }

        //https://jenkov.com/tutorials/java-regex/matcher.html
        //TO DO: learn about group, multiple groups, groups inside groups
        //TO DO: learn about replaceAll() + replaceFirst()

    }

    public static void regexGroups() {

        String text = "John writes about this, and john writes about that, and John writes about everything.";

        String group = "(John)";

        Pattern pattern = Pattern.compile(group, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        int counter = 0;
        while(matcher.find()) {
            counter ++;
            System.out.printf("\nsingle group found #%d: " + matcher.group(1), counter);
        }

    }

    public static void appendMethods() {

        String text = "John Johnson writes about this, and John Doe writes about that, and John Wayne writes about everything.";

        String group = "((John) (.+?)) ";

        Pattern pattern = Pattern.compile(group);
        Matcher matcher = pattern.matcher(text);
        StringBuffer sb = new StringBuffer();

        int counter = 0;
        while(matcher.find()) {
            counter ++;
            matcher.appendReplacement(sb, "Joe Blocks ");
            System.out.printf("\nexample of appendReplacement #%d: " + sb.toString(), counter);
        }

        matcher.appendTail(sb);

        System.out.println("\nexample of appendTail: " + sb.toString());

    }

}
