package Data.DataStructures.Hashing.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDataStructure {

    public static boolean isUnique(String s) {

        HashSet<Character> set = new HashSet<>();
        char [] charArr = s.toCharArray();

        for(int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if (set.contains(charArr[i])) {
                return false;
            }
            set.add(c);
        }

        return true;

    }
}
