package test;

import junit.framework.TestCase;
import main.BinarySearchTree;
import main.Node;

import java.util.List;

public class BinarySearchTreeTest extends TestCase {

    public void testInsert() throws Exception {
        BinarySearchTree tree = new BinarySearchTree();

        Node root = new Node(5);

        tree.insert(root);
        tree.insert(new Node(3));
        tree.insert(new Node(8));
        tree.insert(new Node(2));
        tree.insert(new Node(4));
        tree.insert(new Node(1));
        tree.insert(new Node(7));
        tree.insert(new Node(6));
        tree.insert(new Node(9));
        tree.insert(new Node(10));

        List<Node> inorder = tree.inOrder();
        for (int i=1; i<=10; i++) {
            Node n = inorder.get(i-1);
            assertEquals(i, n.getValue());
        }
    }

}