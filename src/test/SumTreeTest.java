//package test;
//
//import junit.framework.TestCase;
//import main.Node;
//import main.SumTree;
//
//public class SumTreeTest extends TestCase {
//    /**
//     * Normal/Sunny test case
//     */
//    public void test1() {
//        Node root = new Node(26);
//
//        Node n1 = new Node(10);
//        Node n2 = new Node(4);
//        Node n3 = new Node(6);
//        n1.setLeft(n2);
//        n1.setRight(n3);
//        root.setLeft(n1);
//
//        Node n4 = new Node(3);
//        Node n5 = new Node(2);
//        Node n6 = new Node(1);
//        n4.setLeft(n5);
//        n4.setRight(n6);
//        root.setRight(n4);
//
//        SumTree tree = new SumTree(root);
//        assertTrue(tree.isSumTree());
//    }
//
//    /**
//     * null tree
//     */
//    public void test2() {
//        SumTree tree = new SumTree(null);
//        assertFalse(tree.isSumTree());
//    }
//
//    /**
//     * Tree only has root
//     */
//    public void test3() {
//        Node root = new Node(1);
//        SumTree tree = new SumTree(root);
//        assertFalse(tree.isSumTree());
//    }
//
//    /**
//     * Only has left subtree and is not sum tree
//     */
//    public void test4() {
//        Node root = new Node(26);
//
//        Node n1 = new Node(10);
//        Node n2 = new Node(4);
//        Node n3 = new Node(6);
//        n1.setLeft(n2);
//        n1.setRight(n3);
//        root.setLeft(n1);
//
//        SumTree tree = new SumTree(root);
//        assertFalse(tree.isSumTree());
//    }
//
//    /**
//     * Only has left subtree and is sum tree
//     */
//    public void test5() {
//        Node root = new Node(20);
//
//        Node n1 = new Node(10);
//        Node n2 = new Node(4);
//        Node n3 = new Node(6);
//        n1.setLeft(n2);
//        n1.setRight(n3);
//        root.setLeft(n1);
//
//        SumTree tree = new SumTree(root);
//        assertTrue(tree.isSumTree());
//    }
//
//    /**
//     * Only has right subtree and is not sum tree
//     */
//    public void test6() {
//        Node root = new Node(26);
//
//        Node n1 = new Node(10);
//        Node n2 = new Node(4);
//        Node n3 = new Node(6);
//        n1.setLeft(n2);
//        n1.setRight(n3);
//        root.setRight(n1);
//
//        SumTree tree = new SumTree(root);
//        assertFalse(tree.isSumTree());
//    }
//
//    /**
//     * Only has right subtree and is sum tree
//     */
//    public void test7() {
//        Node root = new Node(20);
//
//        Node n1 = new Node(10);
//        Node n2 = new Node(4);
//        Node n3 = new Node(6);
//        n1.setLeft(n2);
//        n1.setRight(n3);
//        root.setRight(n1);
//
//        SumTree tree = new SumTree(root);
//        assertTrue(tree.isSumTree());
//    }
//
//    /**
//     * Not a sum tree
//     */
//    public void test8() {
//        Node root = new Node(20);
//
//        Node n1 = new Node(5);
//        Node n2 = new Node(4);
//        Node n3 = new Node(6);
//        n1.setLeft(n2);
//        n1.setRight(n3);
//        root.setLeft(n1);
//
//        Node n4 = new Node(4);
//        Node n5 = new Node(2);
//        Node n6 = new Node(1);
//        n4.setLeft(n5);
//        n4.setRight(n6);
//        root.setRight(n4);
//
//        SumTree tree = new SumTree(root);
//        assertFalse(tree.isSumTree());
//    }
//}