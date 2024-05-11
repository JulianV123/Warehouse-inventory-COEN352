package coen352.ch4.binary_search_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 All of the code written under the binary_search_tree package was written in tutorial 6 with the help of the tutorial TA.
 */

class MyBSTTest {

    @Test
    void testInsert() {

        MyBST myBST = new MyBST();
        myBST.insert(6);
        myBST.insert(2);
        myBST.insert(3);
        myBST.insert(8);

        Object[] result = myBST.inOrder();

        assertEquals(4, result.length, "Test failed, size not as expected");

    }

    @Test
    void testInOrder() {

        MyBST myBST = new MyBST();
        String answer = "";
        myBST.insert(4);
        myBST.insert(3);
        myBST.insert(1);
        myBST.insert(2);

        Object[] result = myBST.inOrder();
        for(Object number: result) {
            answer = answer+number;
        }

        assertEquals("1234", answer, "Test failed, not the correct array displayed");

    }

    /**

    @Test
    void testDelete() {

        MyBST myBST = new MyBST();
        String answer = "";
        myBST.insert(8);
        myBST.insert(7);
        myBST.insert(5);
        myBST.insert(6);

        myBST.delete(6);

        int[] result = myBST.inOrder();
        for(int number: result) {
            answer = answer+number;
        }

        assertEquals("578", answer, "Test failed, not the correct array displayed");

    }

    @Test
    void testDeleteRoot() {
        MyBST myBST = new MyBST();
        String answer = "";
        myBST.insert(8);
        myBST.insert(7);
        myBST.insert(5);
        myBST.insert(6);

        myBST.delete(5);

        int[] result = myBST.inOrder();
        for(int number: result) {
            answer = answer+number;
        }

        assertEquals("678", answer, "Test failed, not the correct array displayed");
    }

    @Test
    void testFind() {

        MyBST myBST = new MyBST();
        myBST.insert(8);
        myBST.insert(7);
        myBST.insert(5);
        myBST.insert(6);

        int actual = myBST.find(0).getKey();

        assertEquals(6, actual, "Test failed, did not find the expected key");
    }

    **/
}