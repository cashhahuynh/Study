package CodingChallenges;

import java.util.HashMap;
import java.util.Map;

public class TimeConversion {

    public static Map<String, Integer> hm = new HashMap<>();

    static {
        hm.put("AM", 0);
        hm.put("PM", 12);
    }

    public static String timeConversion(String time) {

        StringBuilder sb = new StringBuilder();
        String [] timeArr = time.split(" ");

        //grabbing relevant elements
        String findAMOrPM = timeArr[1];
        int hourTime = Integer.parseInt(timeArr[0].substring(0, 2));
        String restOfTime = timeArr[0].substring(2);

        //transforming hour
        int newHour = hourTime + hm.get(findAMOrPM);
        String stringHour = Integer.toString(newHour);

        if (findAMOrPM.equals("PM")) {
            sb.append(stringHour + restOfTime);
        }

        if (findAMOrPM.equals("AM") && hourTime == 12) {
            newHour = hourTime + 12;
            stringHour = Integer.toString(newHour);
            sb.append(stringHour + restOfTime);
        } else if (findAMOrPM.equals("AM")) {
            sb.append(stringHour + restOfTime);
        }

        return sb.toString();

    }

}
