package Data.DataStructures.Queue.QueueLinkedList;

public class QueueDataStructure {

    public static LinkedListNode enqueue(LinkedListNode head, int num) {

        LinkedListNode ll = new LinkedListNode(num);

        if(head == null) {
            head = ll;
        } else {
            LinkedListNode ll1 = head;
            while(ll1.next != null) {
                ll1 = ll1.next;
            }
            ll1.next = ll;
        }

        return head;
    }

    public static LinkedListNode dequeue(LinkedListNode head) {

        if(head == null) {
            System.out.println("underflow");
        } else {
            head = head.next;
        }

        return head;

    }

    public static void display(LinkedListNode head) {

        if(head == null) {
            System.out.println("No values to print");
        }

        LinkedListNode ll = head;

        while(ll != null) {
            System.out.print(ll.data + " ");
            ll = ll.next;
        }

    }

}
