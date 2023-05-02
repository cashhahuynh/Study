package Data.DataStructures.Stack.StackLinkedList;

import java.util.Scanner;

public class Main {

    public static void main(String [] arg) {

        StackDataStructure stack = new StackDataStructure();
        LinkedListNode head = null;
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Exit");
            System.out.println("\n***************");
            System.out.println("Current profile: ");

            if (head == null) {
                System.out.println("There are no values to print");
            } else {
                StackDataStructure.display(head);
            }

            System.out.println("\n***************");
            System.out.println("\nEnter your choice: ");
            switch(scanner.nextInt()) {
                case 1:
                    System.out.println("\nEnter a value: ");
                    head = stack.push(scanner.nextInt(), head);
                    break;
                case 2:
                    System.out.println("\nPop value: ");
                    head = stack.pop(head);
                    break;
                case 3:
                    System.out.println("\nTop element: " + stack.peek(head));
                    break;
                case 4:
                    System.out.println("\nIs empty: " + stack.isEmpty(head));
                    break;
                case 5:
                    exit = true;
                    break;
            }

        } while(exit == false);

    }

}
