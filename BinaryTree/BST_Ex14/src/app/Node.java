package app;

/**
 * Node
 */
public class Node {

    // Variables
    int value;
    Node parent;
    Node left;
    Node right;

    // Constructor
    public Node(int value){
        this.value = value;
        left = null;
        right = null;
        parent = null;
    }
}