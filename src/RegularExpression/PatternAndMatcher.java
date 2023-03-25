package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {

    public static void patternAndMatcher() {

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
        //TO DO: appendReplacement() + appendTail()

    }

}
