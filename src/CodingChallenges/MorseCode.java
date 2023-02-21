package CodingChallenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCode {

    //need to work on whitespaces
    public static String translation(String str) {
        str = str.replaceAll("\\s+", " ");
        String [] strArr = str.split("[\\s]");

        return Arrays.asList(strArr).stream()
                .map(x -> morseCodeDecoder(x))
                .collect(Collectors.joining(","));
    }

    public static String morseCodeDecoder(String str) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> morseCode = new HashMap<>();
        morseCode.put("", " ");
        morseCode.put(".-", "A"); morseCode.put("-...", "B"); morseCode.put("-.-.", "C"); morseCode.put("-..", "D"); morseCode.put(".", "E");
        morseCode.put("..-.", "F"); morseCode.put("--.", "G"); morseCode.put("....", "H"); morseCode.put("..", "I"); morseCode.put(".---", "J");
        morseCode.put("-.-", "K"); morseCode.put(".-..", "L"); morseCode.put("--", "M"); morseCode.put("-.", "N"); morseCode.put("---", "O");
        morseCode.put(".--.", "P"); morseCode.put("--.-", "Q"); morseCode.put(".-.", "R"); morseCode.put("...", "S"); morseCode.put("-", "T");
        morseCode.put("..-", "U"); morseCode.put("...-", "V"); morseCode.put(".--", "W"); morseCode.put("-..-", "X"); morseCode.put("-.--", "Y"); morseCode.put("--..", "Z");
        morseCode.put(".----", "1"); morseCode.put("..---", "2"); morseCode.put("...--", "3"); morseCode.put("....-", "4"); morseCode.put(".....", "5");
        morseCode.put("-....", "6"); morseCode.put("--...", "7"); morseCode.put("---..", "8"); morseCode.put("----.", "9"); morseCode.put("-----", "0");

        if (morseCode.containsKey(str)) {
            sb.append(morseCode.get(str));
        }
        return sb.toString();
    }

}
