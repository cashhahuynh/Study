package Data.DataStructures.BinarySearchTree;

//
public class BinarySearchTree {

    Node root;

    public static Node insert(Node r, int data) {

        Node node = new Node(data);

        if(r == null) {
            r = node;
        } else if (data < r.data) {
            r.left = insert(r.left, data);
        } else {
            r.right = insert(r.right, data);
        }

        return r;

    }

    public static Node search(int data, Node r) {

        if (r == null || r.data == data) {
            return r;
        } else if (data < r.data) {
            return search(data, r.left);
        }
        return search(data, r.right);
    }

    public static void inorder(Node r) {

        if (r == null) {
            return;
        }

        inorder(r.left);
        System.out.print(r.data + " ");
        inorder(r.right);

    }

    public static Node delete(Node r, int num) {

        if(r == null) {
            return r;
        }

        if(num < r.data) {
            r.left = delete(r.left, num);
        } else if (num > r.data) {
            r.right = delete(r.right, num);
            //if a match is found then delete
        } else {
            //finds inorder successor of the node and copies to node and delete inorder successor
            if(r.left == null) {
                return r.right;
            } else if (r.right == null) {
                return r.left;
            }
            //purpose of this is to get inorder successor if right child is not empty
            //can be obtained by finding minimum value of the right child of node
            r.data = minVal(r.right);
            //this deletes node with the value of the inorder successor
            r.right = delete(r.right, r.data);

        }
        return r;
    }

    public static int minVal(Node r) {

        int minVal = r.data;

        while(!(r.left == null)) {
            minVal = r.left.data;
            r = r.left;
        }

        return minVal;

    }

}
