package javaunittest;

public class Node {
    int val;
    Node left, right;

    Node() {
        this.val = 0;
        this.left = null;
        this.right = null;
    }

    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
