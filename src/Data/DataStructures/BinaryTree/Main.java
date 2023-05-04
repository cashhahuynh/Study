package Data.DataStructures.BinaryTree;

public class Main {

    public static void main(String [] arg) {

        BTNode root = new BTNode(1);
        root.left = new BTNode(2);
        root.right = new BTNode(3);

        root.left.left = new BTNode(4);
        root.left.right = new BTNode(5);

        root.right.left = new BTNode(6);
        root.right.right = new BTNode(7);

        System.out.println("root: " + root.data +
                "\nleft (parent): " + root.left.data +
                "\nright (parent): " + root.right.data +
                "\nleft (child): " + root.left.left.data + " & " + root.left.right.data +
                "\nright (child): " + root.right.left.data + " & " + root.right.right.data);

        System.out.print("\npreorder: ");
        BinaryTreeDataStructure.preorder(root);
        System.out.println();

        System.out.print("\ninorder: ");
        BinaryTreeDataStructure.inorder(root);
        System.out.println();

        System.out.print("\npostorder: ");
        BinaryTreeDataStructure.postorder(root);
        System.out.println();

    }

}
