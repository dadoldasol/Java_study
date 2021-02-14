package javaunittest;

public class Stack {
    private int top = -1;
    private int size = 0;
    private int[] s_arr;

    public Stack(int s_size) {
        this.s_arr = new int[s_size];
        this.top = -1;
        this.setSize(s_size);
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int cur_size) {
        this.size = cur_size;
    }

    public void printStack() {
        if(top<0) {
            System.out.println("there is no data");
        }

        for(int idx=0;idx<=top;idx++) {
            System.out.println("stack["+idx+"] = " + s_arr[idx]);
        }
    }

    public void push(int val) {
        if(this.getSize() == (this.top+1)) {
            int[] temp = new int[this.getSize() * 2];
            for(int idx=0;idx<this.getSize();idx++) {
                temp[idx] = this.s_arr[idx];
            }

            this.s_arr = temp;
            this.setSize(this.getSize()*2);
        }

        this.s_arr[++top] = val;
    }

    public int pop() {
        if(this.top == -1) {
            System.out.println("there is no data");

        }

        int data = s_arr[top--];

        return data;
    }
}
