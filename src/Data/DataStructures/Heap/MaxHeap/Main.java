package Data.DataStructures.Heap.MaxHeap;

import java.util.Scanner;

public class Main {

    public static void main(String [] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the capacity of the array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of array: ");

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        MaxHeap mh = new MaxHeap();

        System.out.println("\nProfile of array: ");
        mh.buildMaxHeap(arr);
        mh.printHeap(arr);

        System.out.printf("\nRoot: %d | Left: %d | Right: %d", arr[0], arr[mh.left(0)], arr[mh.right(0)]);

        //reference to understand how left and right are returning
//        System.out.println("\nRoot node: " + arr[0]);
//        System.out.println("Left child: " + arr[mh.left(0)]);
//        System.out.println("Left left child: " + arr[mh.left(1)]);
//        System.out.println("Left right child: " + arr[mh.right(1)]);
//        System.out.println("Right child: " + arr[mh.right(0)]);
//        System.out.println("Right left child: " + arr[mh.left(2)]);
//        System.out.println("Right right child: " + arr[mh.right(2)]);

        System.out.println("\n");
        System.out.println("\nNew profile of array after deleting the maximum element: " + mh.deleteMax(arr));
        mh.printHeap(arr);
        System.out.printf("\nNew root: %d | New left: %d | New right: %d", arr[0], arr[mh.left(0)], arr[mh.right(0)]);
        System.out.println();

    }

}
