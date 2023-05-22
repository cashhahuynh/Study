package Data.DataStructures.Hashing.HashSet;

public class Main {

    public static void main(String [] arg) {

        String s = "helo wqty";
        boolean answer = HashSetDataStructure.isUnique(s);

        if(answer) {
            System.out.println("String has unique characters");
        } else {
            System.out.println("String does not have unique characters");
        }

    }

}
