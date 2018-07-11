package datastructures.BinaryTree;

public class Groot {
    public static void main(String[] args) {

        // import tree
        BinaryTree tree = new BinaryTree();

        System.out.println(" --- filling tree --- ");
        // add data into tree
        tree.add(1);
        tree.add(4);
        tree.add(3);
        System.out.println();

        System.out.println(" --- searching for data --- ");
        // find a node on the tree
        tree.find(4);
        System.out.println();

        System.out.println(" --- remove data --- ");
        // remove a node and re-shift
        tree.delete(1);
        System.out.println();

        // find deleted root
        tree.find(1);
        System.out.println();

        System.out.println(" --- print --- ");
        tree.printInOrder();
        System.out.println(" --- in order --- ");

        tree.printPreOrder();
        System.out.println(" --- pre-order --- ");

        tree.printPostOrder();
        System.out.println(" --- post-order --- ");


//        // import roots
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//        // print each order results...
//        System.out.println("Pre order traversal: ");
//        tree.printPreorder();
//
//        System.out.println("In order traversal: ");
//        tree.printInorder();
//
//        System.out.println("Post order traversal: ");
//        tree.printPostorder();
    }
}

