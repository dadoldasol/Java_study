package javaunittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeQueueTest {

    @Test
    @DisplayName("Listnodequeue 데이터 삽입 테스트")
    void AddQueueTest() {
        ListNodeQueue listqueue = new ListNodeQueue();

        listqueue.push(10);
        listqueue.push(20);
        listqueue.push(30);
    }

    @Test
    @DisplayName("Listnodequeue 데이터 삭제 테스트")
    void RemoveQueueTest() {
        ListNodeQueue listqueue = new ListNodeQueue();

        listqueue.push(10);
        listqueue.push(20);
        listqueue.push(30);

        listqueue.printalldata();

        int val = listqueue.pop();
        System.out.println("removed val: " + val);

        listqueue.printalldata();
    }

}