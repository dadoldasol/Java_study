package javaunittest;

public class ListNodeStack {
    private ListNode head;

    public void printListNodeStack() {
        ListNode cur = this.head.getNext();
        int idx=0;
        while(cur!=null) {
            System.out.println("stack["+ idx + "] = " +cur.getVal());
            idx++;

            cur = cur.getNext();
        }
    }

    ListNodeStack() {
        this.head = new ListNode();
    }

    void push(int data) {
        ListNode newnode = new ListNode(data);
        this.head.add(this.head, newnode, 1);
    }

    int pop() throws Exception{
        ListNode removednode = this.head.remove(this.head, 1);

        return removednode.getVal();
    }
}
