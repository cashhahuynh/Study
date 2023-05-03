package Data.DataStructures.Queue.QueueLinkedList;

public class Main {

    public static void main(String [] arg) {

        QueueDataStructure queue = new QueueDataStructure();
        LinkedListNode head = null;

        System.out.println("Enqueue of Linked List: ");
        head = queue.enqueue(head, 1);
        head = queue.enqueue(head, 2);
        head = queue.enqueue(head, 3);
        head = queue.enqueue(head, 4);
        head = queue.enqueue(head, 5);
        queue.display(head);

        System.out.println("\nDequeue of Linked List: ");
        head = queue.dequeue(head);
        queue.display(head);

    }

}
