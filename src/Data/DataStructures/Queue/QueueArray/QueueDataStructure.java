package Data.DataStructures.Queue.QueueArray;

public class QueueDataStructure {

    private static int front;
    private static int rear;
    private static int arr [];

    public QueueDataStructure() {
        front = -1;
        rear = -1;
        arr = new int[10];
    }

    public static void enqueue(int num) {

        if(rear == arr.length - 1) {
            System.err.println("overload");
        } else {
            arr[++rear] = num;
        }

        if(front == -1) {
            front ++;
        }

    }

    public static int dequeue() {

        int x = -1;

        if (front == -1) {
            System.err.println("underflow");
        } else {
            x = arr[front++];
        }

        if (rear == 0) {
            rear--;
        }

        return x;

    }

    public static void display() {

        for(int i = front; i < rear + 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
