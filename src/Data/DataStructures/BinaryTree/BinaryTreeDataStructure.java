package Data.DataStructures.BinaryTree;

public class BinaryTreeDataStructure {

    //traverses to root note first then its left child and finally the right child
    public static void preorder(BTNode r) {

        if (r == null) {
            return;
        }

        System.out.print(r.data + " ");
        preorder(r.left);
        preorder(r.right);

    }

    //traverses left child first then the right child and finally its root node
    public static void postorder(BTNode r) {

        if (r == null) {
            return;
        }

        postorder(r.left);
        postorder(r.right);
        System.out.print(r.data + " ");

    }

    //traverses left child first then its root node and finally the right child
    public static void inorder(BTNode r) {

        if (r == null) {
            return;
        }

        inorder(r.left);
        System.out.print(r.data + " ");
        inorder(r.right);

    }

}
