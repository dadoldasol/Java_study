package javaunittest;

public class Queue {
    private int start = -1;
    private int top = 0;
    private int size = 0;
    private int[] q_arr;

    public Queue(int new_size) {
        this.q_arr = new int[new_size];
        this.start = -1;
        this.top = 0;
        this.size = new_size;
    }

    public void printQueue() {
        for(int idx=this.start+1; idx<this.top;idx++) {
            System.out.println("queue[" + idx + "] = " + this.q_arr[idx]);
        }
    }

    public void add(int val) {

        if(this.top >= this.size){
            int[] temp = new int[this.size*2];

            for(int idx=0;idx<this.size;idx++) {
                temp[idx] = this.q_arr[idx];
            }

            this.q_arr = temp;
            this.size = this.size*2;
        }

        this.q_arr[this.top++] = val;
    }

    public int pop() throws Exception {
        if (++this.start == this.top) {
            throw new Exception("There is no data");
        }

        return this.q_arr[this.start];
    }
}
