package main;

/**
 * Check the given Binary Tree is SumTree else false.
 * A SumTree is a Binary Tree where value of every node x is equal to sum of nodes present in its left subtree
 * and right subtree of x. An empty tree is SumTree and sum of an empty tree can be considered as 0.
 * A leaf node is also considered as SumTree.
 */
public class SumTree {

    private Node root;

    public SumTree(Node root) {
        this.root = root;
    }

//    public boolean isSumTree() {
//        if (this.root == null) return false;
//        if (this.root.getRight() == null && this.root.getLeft() == null) return false;
//
//        int sum = getSum(this.root.getLeft()) + getSum(this.root.getRight());
//        if (sum == this.root.getValue())
//            return true;
//        else
//            return false;
//
//    }

    private int getSum(Node node) {
        if (node == null)
            return 0;
        else
            return getSum(node.getLeft()) + (Integer)node.getValue() + getSum(node.getRight());
    }
}
