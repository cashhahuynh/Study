package Data.DataStructures.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] arg) {

        Stack s = new Stack<>();
        Scanner in = new Scanner(System.in);

        boolean exit = false;

        do {
            //displays all elements in stack
            System.out.println("\n0. Display");
            //adds to stack
            System.out.println("1. Push");
            //removes top element in stack
            System.out.println("2. Pop");
            //returns top element in stack
            System.out.println("3. Peek");
            //returns t/f
            System.out.println("4. Is Empty");
            //exists do/while loop
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            switch(in.nextInt()) {
                case 0:
                    s.stream().forEach(System.out::println);
                    break;
                case 1:
                    System.out.println("\nEnter a value: ");
                    s.push(in.nextInt());
                    break;
                case 2:
                    System.out.println("\nPopped element: " + s.pop());
                    break;
                case 3:
                    System.out.println("\nTop element: " + s.peek());
                    break;
                case 4:
                    System.out.println("\nIs empty: " + s.isEmpty());
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("\nWrong choice.");
                    break;
            }
        } while(exit == false);

    }

}
