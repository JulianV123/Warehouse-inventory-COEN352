package coen352.ch4.binary_search_tree;

import java.util.Comparator;

/**
 All of the code written under the binary_search_tree package was written in tutorial 6 with the help of the tutorial TA.
 */

public class MyBST<E extends Comparable<E>> implements iBST {

    Node<E> root;
    int maxSize = 1000;

    @Override
    public E[] inOrder() {
        E[] arrayBST = (E[]) new Comparable[maxSize];
        int size = inOrder(root, arrayBST, 0);
        E[] res = (E[]) new Comparable[size];
        System.arraycopy(arrayBST, 0, res, 0, size);
        return res;
    }

    private int inOrder(Node<E> root, E[] arrayBST, int index) {
        if (root != null) {
            index = inOrder(root.getLeft(), arrayBST, index);
            arrayBST[index] = root.getKey();
            index++;
            index = inOrder(root.getRight(), arrayBST, index);
        }
        return index;
    }

    public void insert(E key) {
        root = insert(root, key);
    }

    private Node<E> insert(Node<E> root, E key) {
        if (root == null) {
            return new Node<>(key);
        }
        if (root.getKey().compareTo(key) < 0) {
            root.setRight(insert(root.getRight(), key));
        }
        else if(root.getKey().compareTo(key) > 0) {
            root.setLeft(insert(root.getLeft(), key));
        }
        return root;
    }

    /**

    @Override
    public void delete(int key) {
        delete(root, key);
    }

    private Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.getKey() < key) {
            root.setRight(delete(root.getRight(), key));
        }
        else if (root.getKey() > key) {
            root.setLeft(delete(root.getLeft(), key));
        }
        else {
            //Delete a node with no children
            if (root.getLeft() == null && root.getRight() == null) {
                return null;
            }
            //Delete a node with only one child (left or right)
            else if (root.getLeft() == null && root.getRight() != null) {
                return root.getRight();
            }
            else if (root.getLeft() != null && root.getRight() == null) {
                return root.getLeft();
            }
            //Delete a node with both children (left anf right)
            Node minNode = findMin(root.getRight());
            root.setKey(minNode.getKey());
            root.setRight(delete(root.getRight(), minNode.getKey()));
        }
        return root;
    }

    private Node findMin(Node node) {
        if (node == null) {
            return null;
        }
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

    @Override
    public Node find(int key) {
        find(root, key);
        return root;
    }

    private Node find(Node root, int key) {

        if(root == null || root.getKey() == key) {
            return root;
        }

        if(root.getKey() < key) {
            find(root.getRight(), key);
        }

        if (root.getKey() > key) {
            find(root.getLeft(), key);
        }

        return root;
    }

    **/
}
