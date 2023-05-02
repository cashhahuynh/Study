package Data.DataStructures.Stack.StackLinkedList;

public class StackDataStructure {

    public static LinkedListNode push(int data, LinkedListNode head) {

        LinkedListNode ll = new LinkedListNode(data);

        if (head == null) {
            head = ll;
        } else {
            ll.next = head;
            head = ll;
        }

        return head;

    }

    public static LinkedListNode pop(LinkedListNode head) {

        if (head == null) {
            System.out.println("underflow");
        } else {
            head = head.next;
        }

        return head;

    }

    public static void display(LinkedListNode head) {

        if (head == null) {
            System.out.println("No nodes to print.");
            return;
        }

        LinkedListNode ll = head;

        while(!(ll == null)) {
            System.out.print(ll.data + " ");
            ll = ll.next;
        }
    }

    public static boolean isEmpty(LinkedListNode head) {
        return head == null;
    }

    public static int peek(LinkedListNode head) {
        return head == null ? -1 : head.data;
    }

}
