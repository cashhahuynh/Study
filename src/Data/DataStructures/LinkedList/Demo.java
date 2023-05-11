package Data.DataStructures.LinkedList;

public class Demo {

    LinkedListNode head;

    //if there is nothing head is key; else replace next with head and replace head with key
    public static LinkedListNode insertInBeginning(int key, LinkedListNode head) {

        LinkedListNode ll = new LinkedListNode(key);

        if(head == null) {
            head = ll;
        } else {
            ll.next = head;
            head = ll;
        }
        return head;
    }

    //if there is nothing head is key; else--while there is no next--replace head with next, and replace next with key
    public static LinkedListNode insertInEnd(int key, LinkedListNode head) {

        LinkedListNode ll = new LinkedListNode(key);
        LinkedListNode ll1 = head;

        if(ll1 == null) {
            head = ll;
        } else {
            while(!(ll1.next == null)) {
                ll1 = ll1.next;
            }
            ll1.next = ll;
        }
        return head;
    }

    //if position is 0 replace next with head and head with key
    //else move head to next position: key's next position is null, and null position is key
    public static LinkedListNode insertAtPos(int key, int pos, LinkedListNode head) {

        LinkedListNode ll = new LinkedListNode(key);

        if(pos == 0) {
            ll.next = head;
            head = ll;
        } else {
            LinkedListNode ll1 = head;
            for(int i = 1; /**!(ll1 == null) &&**/ i < pos; i++) {
                ll1 = ll1.next;
            }
            ll.next = ll1.next;
            ll1.next = ll;
        }
        return head;
    }

    //if position is 0 replace with next (null)
    //else head is null and next is null
    public static LinkedListNode delete(int pos, LinkedListNode head) {

        LinkedListNode ll = head;
        if(pos == 0) {
            head = ll.next;
        } else {
            //compare against pos - 1 to account 0 as index?
            for(int i = 1; /**!(ll == null) &&**/ i < pos - 1; i++) {
                ll = ll.next;
            }
            //next becomes null
            ll.next = ll.next.next;
        }
        return head;
    }

    public static int length(LinkedListNode head) {

        LinkedListNode ll = head;
        int lgth = 0;

        if(ll == null) {
            return 0;
        } else {
            while (!(ll == null)) {
                ll = ll.next;
                lgth++;
            }
        }
        return lgth;
    }

    public static LinkedListNode reverse(LinkedListNode head) {

        LinkedListNode previousNode = null;
        LinkedListNode currentNode = head;
        LinkedListNode nextNode = null;

        while(!(currentNode == null)) {

            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;

            //grabs next element for while loop
            currentNode = nextNode;

        }

        //
        head = previousNode;
        return head;

    }

    public static void display(LinkedListNode head) {

        LinkedListNode ll = head;
        while(!(ll == null)) {

            System.out.print(ll.data + " ");
            ll = ll.next;

        }

    }

}
