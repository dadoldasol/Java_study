package javaunittest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ListNodeTest {

    @Test
    @DisplayName("리스트노드 생성 및 출력 테스트")
    void MakeTest() {
        ListNode head = new ListNode(10);
        ListNode s_node = new ListNode(20);
        ListNode t_node = new ListNode(30);
        assertNotNull(head);
        assertNotNull(s_node);
        assertNotNull(t_node);

        head.add(head, s_node, 1);
        head.add(head, t_node, 1);

        ListNode cur = head;
        while(cur != null) {
            System.out.println("value: " + cur.getVal());

            cur = cur.getNext();
        }
    }

    @Test
    @DisplayName("리스트노드 삭제 및 출력 테스트")
    void DeleteTest() {
        ListNode head = new ListNode(10);
        ListNode s_node = new ListNode(20);
        ListNode t_node = new ListNode(30);
        assertNotNull(head);
        assertNotNull(s_node);
        assertNotNull(t_node);

        head.add(head, s_node, 1);
        head.add(head, new ListNode(40), 1);
        head.add(head, new ListNode(50), 1);
        head.add(head, t_node, 1);

        ListNode cur = head;
        while(cur != null) {
            System.out.println("value: " + cur.getVal());

            cur = cur.getNext();
        }

        System.out.println("Remove index 1 node");
        head.remove(head, 1);

        cur = head;
        while(cur != null) {
            System.out.println("value: " + cur.getVal());

            cur = cur.getNext();
        }
    }

    @Test
    @DisplayName("리스트노드 검색 테스트")
    void SearchTest() {
        ListNode head = new ListNode(10);
        ListNode s_node = new ListNode(20);
        ListNode t_node = new ListNode(30);
        assertNotNull(head);
        assertNotNull(s_node);
        assertNotNull(t_node);

        head.add(head, s_node, 1);
        head.add(head, new ListNode(40), 1);
        head.add(head, new ListNode(50), 1);
        head.add(head, t_node, 1);

        if(head.contains(head, t_node)) {
            System.out.println("node : " + t_node.getVal() + " exists");
        }
        else {
            System.out.println("node : " + t_node.getVal() + " doesn't exist");
        }
    }
}