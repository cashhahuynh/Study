package BuiltInClasses;

import java.util.Scanner;

public class ScannerClass {

    //Scanner class is user input
    public static void scannerTest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        scanner.close();

        System.out.printf("Your name is %s! Study well.", name);
    }

}
