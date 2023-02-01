package CodingChallenges;

public class Permutations {

    public static void permutation(String input) {
        recursivePermutations("", input);
    }

    private static void recursivePermutations(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i ++) {
                recursivePermutations(perm + word.charAt(i), word.substring(0, i)
                        + word.substring(i + 1));
            }
        }
    }

}
