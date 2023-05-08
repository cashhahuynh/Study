package Data.DataStructures.BinarySearchTree;

//
public class Main {

    public static void main(String [] arg) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(10);
        bst.root.left = new Node(5);
        bst.root.right = new Node(15);

        System.out.println("Current succession of BST: ");
        bst.inorder(bst.root);

        System.out.println("\nSuccession of BST after left insert: ");
        bst.insert(bst.root, 4);
        bst.inorder(bst.root);

        System.out.println("\nSuccession of BST after right insert: ");
        bst.insert(bst.root, 14);
        bst.inorder(bst.root);


        System.out.println("\nSuccession of BST after deleting 4: ");
        bst.delete(bst.root, 4);
        bst.inorder(bst.root);


        System.out.println("\nSearch test for 5: ");
        Node find = bst.search(5, bst.root);
        Node find1 = bst.search(13, bst.root);
        find(find);

        System.out.println("\nSearch test for 13: ");
        find(find1);

    }

    public static void find (Node r) {
        if (r == null) {
            System.err.print("Data structure doesn't contain value");
        } else {
            System.out.printf("Found: %d", r.data);
        }
    }

}
