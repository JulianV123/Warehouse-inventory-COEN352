package coen352.ch4.binary_search_tree;

/**
 All of the code written under the binary_search_tree package was written in tutorial 6 with the help of the tutorial TA.
 */

/* Created by pourya on 2023-10-29 6:29 p.m. */
public class Node<E extends Comparable<E>> {
    private E key;
    private Node<E> right;
    private Node<E> left;


    Node(E key){ this.key = key;}

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
