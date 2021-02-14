package javaunittest;

public class ListNode {
    private int list_val;
    private ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.list_val = val;
        this.next = null;
    }

    int getVal() {
        return this.list_val;
    }

    void setVal(int val) {
        this.list_val = val;
    }

    ListNode getNext() {
        return this.next;
    }

    void setNext(ListNode next) {
        this.next = next;
    }

    ListNode add(ListNode head, ListNode nodeToAdd, int position) {

        if(position==0) {
            if(head == null)
                return nodeToAdd;

            nodeToAdd.setNext(head);

            return nodeToAdd;
        }

        ListNode cur = head;
        for(int idx=0;idx<position-1;idx++) {
            cur = cur.getNext();
        }

        nodeToAdd.setNext(cur.getNext());
        cur.setNext(nodeToAdd);
        return nodeToAdd;
    }

    ListNode remove(ListNode head, int positionToRemove) {

        if(positionToRemove<=0){
            System.out.println("invalid index");
            return null;
        }

        ListNode cur = head;
        for(int idx=0;idx<positionToRemove-1;idx++) {
            cur = cur.getNext();
        }

        ListNode removenode = cur.getNext();

        cur.setNext(cur.getNext().getNext());
        return removenode;
    }

    boolean contains(ListNode head, ListNode nodeTocheck) {

        ListNode cur = head;

        while(cur!=null) {

            if(cur==nodeTocheck)
                return true;

            cur = cur.getNext();
        }

        return false;
    }
}
