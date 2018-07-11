package datastructures.LinkedListPractice;

/*
 *
 * Monday Morning Challenge:
 * - write a complete functional LinkedList from scratch
 * - must have an append(), prepend(), find(), delete() methods
 * - I'd recommend using a Node class and a LinkedList class
 * - it must be generic
 * - also add a list() method that will print out the contents of each object in the LinkedList
 *
 */

// declare generic class
public class LinkedList<T> {
    // declare static variables
    Node head;

    // APPEND
    public void append(T data) {
        // declare head

        // if no head exists, create head
        if (head == null) {
            head = new Node(data);
            System.out.println("New Head node created: " +data);
            return;
        }

        // work down the list
        Node current = head;

        // run down the list until end is reached (null)
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
        System.out.println("New node created: " +data);
    }

    // PREPEND
    public void prepend(T data) {
        Node current = new Node(data);
        // find head; if head matches data type, return
        if (head == null) {
            head = new Node(data);
            System.out.println("New node added to end: " +data);
        }

        // return new head to replace current head.
        current.next = head;
        head = current;
        System.out.println("Prepend node = head: " +data);
    }

    // DELETE
    public void deleteNode(T data) {
        System.out.println("--- delete node ---");
        // find head
        if (head == null) {
            return;
        } else if (head.data == data) {
            head = null;
            System.out.println("Head node removed: " +data);
        }
        // start at the front of the list
            Node current = head;

        // if data type is next node, skip around to next node
        while (current.data != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                System.out.println("Node skipped: " +data);
                return;
            }
            // if data is current node, skip to next
            current = current.next;
        }

    }

    // FIND
    public void findNode() {
        System.out.println("--- find node ---");

        // Start at the top of the list
        if (head == null) {
            return;
        }

        // go through the list
        head = head.next;

        // if key is found??
        if (head.next == null) {
            return;
        } else if (head.next == head.data) {
            System.out.println("Node: " +head.data);
            return;
        }
    }

    // LIST/PRINT METHOD
    public void print() {
        System.out.println("---- list ----");
        // Start at the top of the list
        if (head == null) {
            return;
        }

        // find length of the array list
        Node current = head;

        // print if true
        while (head != null) {
            System.out.println("Node - " +current.data);

            if (current.next == null) {
            return;
            }
            current = current.next;
        }
    }
}


