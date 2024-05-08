
public class BTS {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        // tree.insert(8);

        System.out.println();
        System.out.print("In-Order :- ");
        tree.inOrder(); 
        System.out.println();
        System.out.print("Post-Order : ");
        tree.postOrder();
        System.out.println();
        System.out.print("Pre-Order : ");
        tree.preOrder();
    }
}
