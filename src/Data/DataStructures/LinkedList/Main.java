package Data.DataStructures.LinkedList;

import java.util.Scanner;

public class Main {

    public static void main(String [] arg) {

        Demo l = new Demo();
        l.head = null;
        Scanner in = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("\n1. Insert in end");
            System.out.println("2. Insert in beginning");
            System.out.println("3. Insert at a particular position");
            System.out.println("4. Delete at a position");
            System.out.println("5. Length");
            System.out.println("6. Reverse");
            System.out.println("7. Exit");
            System.out.println("\n***************");
            System.out.print("Current profile: ");

            if (l.head == null) {
                System.out.println("There is nothing in this LinkedList");
            } else {
                Demo.display(l.head);
            }

            System.out.println("\n***************");
            System.out.println("\nEnter your choice: ");
            switch(in.nextInt()) {
                case 1:
                    System.out.println("\nEnter the value to insert to the end: ");
                    l.head = l.insertInEnd(in.nextInt(), l.head);
                    break;
                case 2:
                    System.out.println("\nEnter the value to insert to the beginning: ");
                    l.head = l.insertInBeginning(in.nextInt(), l.head);
                    break;
                case 3:
                    System.out.println("\nEnter the value then the position to insert at its position: ");
                    l.head = l.insertAtPos(in.nextInt(), in.nextInt(), l.head);
                    break;
                case 4:
                    System.out.println("\nEnter the position to delete value: ");
                    l.head = l.delete(in.nextInt(), l.head);
                    break;
                case 5:
                    System.out.println(l.length(l.head));
                    break;
                case 6:
                    l.head = l.reverse(l.head);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("\nWrong choice.");
                    break;
            }
        } while(exit == false);

    }

}
