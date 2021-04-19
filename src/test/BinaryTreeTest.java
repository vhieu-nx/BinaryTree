package test;

import junit.framework.TestCase;
import main.BinaryTree;
import main.Node;

import java.util.List;

public class BinaryTreeTest extends TestCase {

    private BinaryTree tree;
    public void setUp() throws Exception {
        super.setUp();
        Node root = new Node(1);
        tree = new BinaryTree(root);
        tree.insert(new Node(Integer.valueOf(2)));
        tree.insert(new Node(Integer.valueOf(3)));
        tree.insert(new Node(Integer.valueOf(4)));
        tree.insert(new Node(Integer.valueOf(5)));
        tree.insert(new Node(Integer.valueOf(6)));
        tree.insert(new Node(Integer.valueOf(7)));
    }


    public void testPreOrder() throws Exception {
        int[] result = new int[]{1,2,4,5,3,6,7};
        List<Node> preOrder = tree.preOrder();
        for (int i=0; i<result.length; i++) {
            assertEquals(result[i], ((Integer)preOrder.get(i).getValue()).intValue());
        }
    }

    public void testPreOrder2() throws Exception {
        int[] result = new int[]{1,2,4,5,3,6,7};
        List<Node> preOrder = tree.preOrder2();
        for (int i=0; i<result.length; i++) {
            assertEquals(result[i], ((Integer)preOrder.get(i).getValue()).intValue());
        }
    }

    public void testInOrder() throws Exception {
        int[] result = new int[]{4,2,5,1,6,3,7};
        List<Node> inOrder = tree.inOrder();
        for (int i=0; i<result.length; i++) {
            assertEquals(result[i], ((Integer)inOrder.get(i).getValue()).intValue());
        }
    }

    public void testPostOrder() throws Exception {
        int[] result = new int[]{4,5,2,6,7,3,1};
        List<Node> postOrder = tree.postOrder();
        for (int i=0; i<result.length; i++) {
            assertEquals(result[i], ((Integer)postOrder.get(i).getValue()).intValue());
        }
    }

    public void testBfs() throws Exception {
        int[] result = new int[]{1,2,3,4,5,6,7};
        List<Node> bfsOrder = tree.bfs();
        for (int i=0; i<result.length; i++) {
            assertEquals(result[i], ((Integer)bfsOrder.get(i).getValue()).intValue());
        }
    }

}