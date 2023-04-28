package Data.DataStructures.Stack;

//logic for Stack class
public class StackDataStructure {

    private static int[] arr = new int[100];
    private static int top = -1;

    //adds to end (top) of array
    public static void push(int num) {
        if (top == arr.length - 1) {
            System.out.println("overflow");
        } else {
            arr[++top] = num;
        }
    }

    //removes top element
    public static int pop() {

        if(top==-1) {
            System.out.println("underflow");
            return top;
        } else {
            System.out.println("pop: " + arr[top--]);
            return (arr[top--]);
        }

    }

    //displays elements in array
    public static void display() {

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }

    }

    public static boolean isEmpty() {
        if(top==-1) {
            return true;
        } else {
            return false;
        }
    }

    //returns top element inserted
    public static int peek() {

        if(top==-1) {
            return top;
        } else {
            System.out.println("peek: " + arr[top]);
            return arr[top];
        }

    }

}
