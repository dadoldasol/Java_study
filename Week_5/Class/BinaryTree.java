package javaunittest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    Node root;

    BinaryTree(Node root) {
        this.root = root;
    }

    void BFS() {
        System.out.println("BFS -> ");
        Queue<Node> queue = new LinkedList<>();

        queue.add(this.root);

        while(!queue.isEmpty()) {
            Node cur = queue.poll();

            System.out.print(cur.val + " -> ");

            if(cur.left != null)
                queue.add(cur.left);

            if(cur.right != null)
                queue.add(cur.right);
        }
    }

    void DFS() {
        System.out.println("DFS -> ");
        Stack<Node> stack = new Stack<>();

        Node cur = this.root;
        while(!stack.isEmpty() || cur != null) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();

            System.out.print(cur.val + " -> ");

            cur = cur.right;
        }
    }
}