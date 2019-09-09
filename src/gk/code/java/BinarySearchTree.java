
// PACKAGE/IMPORTS --------------------------------------------------
package gk.code.java;

class Node {
    int key;
    Node left = null;
    Node right = null;

    /**
     * @param key
     */
    public Node(int key) {
        super();
        this.key = key;
    }
}

public class BinarySearchTree {

    public static boolean isIdentical(Node x, Node y) {
        if (x == null && y == null)
            return true;

        return (x != null && y != null && (x.key == y.key) && isIdentical(x.left, y.left) && isIdentical(x.right, y.right));
    }

    public static int height(Node x) {
        if (x == null)
            return 0;

        return 1 + Math.max(height(x.left), height(x.right));
    }

    public static void inOrder(Node x) {
        if (x == null)
            return;

        inOrder(x.left);
        System.out.println(x.key);
        inOrder(x.right);
    }

    public static void main(String[] args) {

    }
}
