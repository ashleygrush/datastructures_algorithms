package datastructures.LinkedListPractice;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    LinkedList<Number> testLink = new LinkedList();

    @Before
    public void setUp() throws Exception {
        testLink.append(2);
        testLink.append(4);
        testLink.append(6);
    }

    @Test
    public void append() {
        testLink.append(8);
    }

    @Test
    public void prepend() {
//        testLink.prepend(6);
//        assertNotNull(testLink.findNode(8));
    }

    @Test
    public void findNode() {
//        testLink.findNode(8);
//        assertNull(testLink.findNode(4));
    }


    @Test
    public void deleteNode() {
//        testLink.deleteNode(8);
//        assertNull(testLink.findNode(6));
    }




}