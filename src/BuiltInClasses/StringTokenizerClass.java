package BuiltInClasses;

import java.util.StringTokenizer;

public class StringTokenizerClass {

    public static void stringTokenizer() {

        System.out.println("One parameter: ");
        StringTokenizer st1 = new StringTokenizer("It's a beautiful day today.");

        while(st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        System.out.println("\nTwo parameters: ");
        StringTokenizer st2 = new StringTokenizer("2+3-1*8/4", "+*-/");

        while(st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        //if return value is true, delimiters are considered tokens
        System.out.println("\nThree parameters with return value as true: ");
        StringTokenizer st3 = new StringTokenizer("cash, dylan, nick", ",", true);

        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }

        //if return value is false, delimiters are considered not tokens
        System.out.println("\nThree parameters with return value as false: ");
        StringTokenizer st4 = new StringTokenizer("cash, dylan, nick", ",", false);

        while(st4.hasMoreTokens()) {
            System.out.println(st4.nextToken());
        }

    }

}
