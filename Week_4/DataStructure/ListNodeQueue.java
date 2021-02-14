package javaunittest;

public class ListNodeQueue {
    private ListNode head;
    private int top = 0;

    ListNodeQueue() {
        head = new ListNode();
    }

    void printalldata() {
        ListNode cur = head.getNext();
        int idx=0;

        while(cur!=null) {
            System.out.println("stack["+ idx + "] = " +cur.getVal());
            cur = cur.getNext();
            idx++;
        }
    }

    void push(int val) {
        ListNode newnode = new ListNode(val);
        this.head.add(this.head, newnode, ++top);
    }

    int pop() {
        ListNode removednode = this.head.remove(this.head, top--);

        return removednode.getVal();
    }
}
