package datastructures.HashMapPractice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashMapTest {

    HashMap<String, Number> testMap = new HashMap<>();

    // like a constructor to set variables
    @Before
    public void setUp() throws Exception {
        System.out.println(" -- Starting Test -- ");
        testMap.add("Ryan", 36);
        testMap.add("Saulo", 30);
        testMap.add("Ashley", 30);
    }

    @Test
    public void add() {
        System.out.println(" -- adding -- ");
        testMap.add("Madoka", 21);
        assertNotNull(testMap.find("Madoka"));
    }

    // want to make sure there's something to find/remove first
    @Test
    public void find() {
        System.out.println(" -- searching --");
        testMap.find("Ryan");
        assertNotNull(testMap.find("Saulo"));

    }

    @Test
    public void delete() {
        System.out.println(" -- deleteing --");
        testMap.delete("Ryan");
        assertNull(testMap.find("Ryan"));


        System.out.println(" -- Test Complete -- ");
    }
}