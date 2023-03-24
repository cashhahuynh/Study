package CodingChallenges;

public class WhoLikesIt {

    public static String whoLikesIt(String names) {

        String [] arr = names.split(" ");

        final int lgth = arr.length;

        StringBuilder sb = new StringBuilder();

        switch(lgth) {
            case 0:
                sb.append("no one likes this");
                break;
            case 1:
                sb.append(String.format("%s likes this", arr[0]));
                break;
            case 2:
                sb.append(String.format("%s and %s like this", arr[0], arr[1]));
                break;
            case 3:
                sb.append(String.format("%s, %s and %s like this", arr[0], arr[1], arr[2]));
                break;
            default:
                sb.append(String.format("%s, %s and %d others like this", arr[0], arr[1], lgth - 2));
        }
        return sb.toString();
    }

}
