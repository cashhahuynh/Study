package Interfaces;

public class StreamInterface {

    public static boolean pangramCheck(String sentence) {
        return sentence.chars().map(Character::toLowerCase)
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == 26;
    }

}
