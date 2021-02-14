package javaunittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {

    @Test
    @DisplayName("리스트노드 스택 추가 테스트")
    void addListNodeStack() throws Exception {
        ListNodeStack ns = new ListNodeStack();
        assertNotNull(ns);

        ns.push(10);
        ns.push(20);
        ns.push(30);
        ns.push(40);

        ns.printListNodeStack();
    }

    @Test
    @DisplayName("리스트노드 스택 제거 테스트")
    void removeListNodeStack() throws Exception {
        ListNodeStack ns = new ListNodeStack();
        assertNotNull(ns);

        ns.push(10);
        ns.push(20);
        ns.push(30);
        ns.push(40);

        ns.printListNodeStack();

        int val = ns.pop();
        System.out.println("removed val : " + val);
        val = ns.pop();
        System.out.println("removed val : " + val);
        val = ns.pop();
        System.out.println("removed val : " + val);
        val = ns.pop();
        System.out.println("removed val : " + val);

        ns.printListNodeStack();
    }
}