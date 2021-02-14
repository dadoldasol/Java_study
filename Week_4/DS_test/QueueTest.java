package javaunittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    @DisplayName("queue arr 데이터 삽입 테스트")
    void addQueueArrTest() {
        Queue queue = new Queue(4);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.printQueue();
    }

    @Test
    @DisplayName("queue arr 데이터 삭제 테스트")
    void removeQueueArrTest() throws Exception {
        Queue queue = new Queue(4);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        queue.printQueue();

        int val= queue.pop();
        System.out.println("removed val: " + val);

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();

        queue.printQueue();
    }
}