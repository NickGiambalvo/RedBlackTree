public class RedBlackTree {

    public static boolean BLACK = false; // constant representing the color black
    public static boolean RED = true; // constant representing the color red
    public Node root; // Establishes root of the tree

//    Inserts a value
    public void insert(int value) {
        root = insert(root, value);
        root.color = BLACK; // Ensures the root is always black after a value is inserted
    }
//    Recursive method to insert a value into tree
    public Node insert(Node node, int value) {
//        Base case, if current node is null, create a new red node
        if (node == null) return new Node(value, RED);
//        Recursive cases based comparing the values
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        } else {
            return node; // Value already exists in the tree
        }
//        Checks and performs necessary rotations and color changes
        if (isRed(node.right) && !isRed(node.left)) node = rotateLeft(node);
        if (isRed(node.left) && isRed(node.left.left)) node = rotateRight(node);
        if (isRed(node.left) && isRed(node.right)) changeColor(node);

        return node; // Returns the updated node
    }
//   Sorts the tree into number order
    public void sortingOfTree(Node node, StringBuilder result) {
        if (node != null) {
            sortingOfTree(node.left, result);
            result.append(node.value).append(" ");
            sortingOfTree(node.right, result);
        }
    }
//   Method to check and see if a value is present in the tree
    public boolean find(int value) {
        return find(root, value);
    }

//    Recursive method to check if a value exist in the tree
    public boolean find(Node node, int value) {
        if (node == null) return false;
//        Recursive cases based on the comparisons of the value
        if (value < node.value) {
            return find(node.left, value);
        } else if (value > node.value) {
            return find(node.right, value);
        } else {
            return true; // Value found in the current node
        }
    }

//   Checks if a node is red
    public boolean isRed(Node node) {
        if (node == null) return false;
        return node.color == RED;
    }

//    Performs a left rotation on the given node
    public Node rotateLeft(Node node) {
        Node x = node.right;
        node.right = x.left;
        x.left = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }

//    Performs a right rotation on the given node
    public Node rotateRight(Node node) {
        Node x = node.left;
        node.left = x.right;
        x.right = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }

//    Method that changes the color of the nodes
    public void changeColor(Node node) {
        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;
    }

//    Builds a string representation that helps put the tree in order
    public String toString() {
        StringBuilder result = new StringBuilder();
        sortingOfTree(root, result);
        return result.toString().trim();
    }


}

