package datastructures.BinaryTree;

public class BinaryTree {

    // import node/root of tree
    Node root;

    // constructor to call tree in controller
    public BinaryTree() {
        root = null;
    }


    // ADD VALUES
    public boolean add(int data) {
        // if no root exists, create new root
        if (root == null) {
            root = new Node(data);
            return true;
            // otherwise see where to place root.
        } else
            return root.add(data);
    }


    // FIND VALUES
    public boolean find(int data) {
        // if no root exists, return false(null)
        if (root == null) {
            return false;
            // otherwise, search through root nodes.
        } else
            return root.find(data);
    }


    // REMOVE VALUES
    public void delete(int data) {
        // establishes data to be removed.
        root.remove(root, data);
    }

    // print in order
    public void printInOrder() {
        root.printInorder();
    }

    // print in pre-order
    public void printPreOrder() {
        root.printPreorder();
    }

    // print in post-order
    public void printPostOrder() {
        root.printPostorder();
    }
}

