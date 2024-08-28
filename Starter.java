public class Starter{

public static void main(String[] args) {
        RedBlackTree redBlackTree = new RedBlackTree();
        redBlackTree.insert(90);
        redBlackTree.insert(60);
        redBlackTree.insert(120);
        redBlackTree.insert(270);
        redBlackTree.insert(30);
        redBlackTree.insert(150);
        redBlackTree.insert(180);

        System.out.println("Sorted tree: " + redBlackTree.toString());
        System.out.println("Find 30: " + redBlackTree.find(30));
        System.out.println("Find 287: " + redBlackTree.find(287));
    }
}

