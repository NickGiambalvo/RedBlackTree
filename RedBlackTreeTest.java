import org.junit.Test;
import static org.junit.Assert.*;

public class RedBlackTreeTest {
// Test my insert and finding method
    @Test
    public void testInsertAndFind(){

        RedBlackTree redBlackTree = new RedBlackTree();
        redBlackTree.insert(90);
        redBlackTree.insert(60);
        redBlackTree.insert(120);
        redBlackTree.insert(270);
        redBlackTree.insert(30);
        redBlackTree.insert(150);
        redBlackTree.insert(180);

        assertTrue(redBlackTree.find(90));
        assertTrue(redBlackTree.find(60));
        assertTrue(redBlackTree.find(120));
        assertTrue(redBlackTree.find(270));
        assertTrue(redBlackTree.find(30));
        assertTrue(redBlackTree.find(150));
        assertTrue(redBlackTree.find(180));

        assertFalse(redBlackTree.find(145));
        assertFalse(redBlackTree.find(250));

    }

}
