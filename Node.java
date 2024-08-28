// Class representing a node
public class Node {
    int value; //Value stored in the node
    Node left; // Reference to left child
    Node right; // Reference to right child
    boolean color; //Color of the node, either red or black

//    Constructor to initialize a node with a value and color
    Node(int value, boolean color) {
        this.value = value;
        this.color = color;
    }
}