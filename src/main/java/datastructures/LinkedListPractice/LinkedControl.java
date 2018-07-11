package datastructures.LinkedListPractice;

public class LinkedControl {
    public static void main(String[] args) {

     LinkedList<Integer> list = new LinkedList<Integer>();

        System.out.println(" --- append --- ");
     list.append(2);
     list.append(4);
     list.append(3);

     list.findNode();

     list.deleteNode(3);

     list.print();


    }
}
