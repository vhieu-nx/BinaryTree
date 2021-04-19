package main;

/**
 * This is the Binary Search Tree implementation
 */
public class BinarySearchTree extends BinaryTree {

    /**
     * Constructor with root node
     * @param root root node
     */
    public BinarySearchTree(Node root) {
        super(root);
    }

    /**
     * Create a tree object without root node.
     */
    public BinarySearchTree() {
        this.setRoot(null);
    }

    @Override
    public void insert(Node newNode) {
        if (this.getRoot() == null) {
            this.setRoot(newNode);
        } else {
            this.insert2(this.getRoot(), newNode);
        }
    }

    private void insert2(Node currentNode, Node newNode) {
        if (((Integer)currentNode.getValue()).intValue() > ((Integer)newNode.getValue()).intValue()) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
            } else {
                this.insert2(currentNode.getLeft(), newNode);
            }
        } else {
            if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
            } else {
                this.insert2(currentNode.getRight(), newNode);
            }
        }
    }

}
