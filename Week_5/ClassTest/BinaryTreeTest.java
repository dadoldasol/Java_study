package javaunittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    @DisplayName("DFS로 주어진 binary tree 순회하기")
    void dfsPrintTree() {
        Node node7 = new Node(7, null, null);
        Node node6 = new Node(6, null, null);
        Node node5 = new Node(5, null, null);
        Node node4 = new Node(4, null, null);
        Node node3 = new Node(3, node6, node7);
        Node node2 = new Node(2, node4, node5);
        Node node1 = new Node(1, node2, node3);

        BinaryTree binaryTree = new BinaryTree(node1);


        binaryTree.DFS();
    }

    @Test
    @DisplayName("BFS로 주어진 binary tree 순회하기")
    void bfsPrintTree() {
        Node node7 = new Node(7, null, null);
        Node node6 = new Node(6, null, null);
        Node node5 = new Node(5, null, null);
        Node node4 = new Node(4, null, null);
        Node node3 = new Node(3, node6, node7);
        Node node2 = new Node(2, node4, node5);
        Node node1 = new Node(1, node2, node3);

        BinaryTree binaryTree = new BinaryTree(node1);

        binaryTree.BFS();
    }
}