package datastructures.BinaryTree;

public class Node {

    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    // ADD VALUES
    public boolean add(int data) {
        // declare node for new data
        Node node = new Node(data);
        // if data already exists, return false.
        if (data == this.data)
            return false;
            // if new data is less than this.data...
        else if (data < this.data) {
            // if nothing to the left, make new node.
            if (left == null) {
                left = node;
                System.out.println(data + " Root planted on left side as new node.");
                return true;
                // otherwise create node to the left.
            } else
                System.out.println(data + " root planted on left side.");
            return left.add(data);
        }

        // if data is greater than root.data, move right.
        else if (data > this.data) {
            // if nothing to the left, make new node.
            if (right == null) {
                right = node;
                System.out.println(data + " Root planted on right side as new node.");
                return true;
                // otherwise create node to the right.
            } else
                System.out.println(data + " root planted on left side.");
            return right.add(data);
        }
        // if nothing works, return false.
        return false;
    }


    // FIND VALUES
    public boolean find(int data) {
        // set data to true
        if (data == this.data) {
            return true;
        }
        // work towards the left
        else if (data < this.data) {
            // if not on the left side, return false.
            if (left == null) {
                return false;
                // if on the left side, return.
            } else {
                System.out.println(data + " is on the left side of " + this.data);
                return left.find(data);
            }
        }
        // work towards the right
        else {
            // if not on the right side, return false.
            if (right == null) {
                return false;
            }
            // if on the right side, return.
            else {
                System.out.println(data + " is on the right side of " + this.data);
                return right.find(data);
            }
        }
    }


    // REMOVE VALUES
    public Node remove(Node node, int data) {

        // if tree is empty...
        if (node == null)
            return node;

        // move down left side of tree
        if (data < this.data)
            node.left = remove(node.left, data);

            // move down the right side of tree.
        else if (data > this.data)
            node.right = remove(node.right, data);

            // if data is the same as the root; shift around it.
        else {
            // node with only one child or less
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            // node with two children... move to smallest node
            node.data = minValue(node.right);
            // delete inner node
            node.right = remove(node.right, node.data);
            System.out.println(data + " Removed.");
        }
        return node;

    }


    // set smallest value
    public int minValue(Node root) {

        int minV = root.data;
        while (root.left != null) {
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    }

    void printPostorder() {
        if (right != null) {
            right.printPostorder();
        }
        System.out.print(data+ " , ");
        if (left != null) {
            left.printPostorder();
        }
    }

    public void printInorder() {
        if (left != null) {
            left.printInorder();
        }
        System.out.print(data+ " , ");
        if (right != null) {
            right.printInorder();
        }
    }


    void printPreorder() {
        System.out.print(data+ " , ");
        if (left != null)
            left.printPreorder();
        if (right != null)
            right.printPreorder();
    }
}

