package Data.DataStructures.Queue.QueueArray;

public class Main {

    public static void main(String[] arg) {

        QueueDataStructure queue = new QueueDataStructure();

        System.out.println("Enqueue example: ");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.display();

        System.out.println("\nDequeue example: ");
        queue.dequeue();
        queue.display();

    }

}
