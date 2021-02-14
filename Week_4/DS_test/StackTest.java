package javaunittest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    @DisplayName("stack 생성 테스트")
    void makeStack() {
        Stack stack = new Stack(4);
        assertNotNull(stack);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.printStack();
    }

    @Test
    @DisplayName("stack pop 테스트")
    void popStack() {
        Stack stack = new Stack(10);
        assertNotNull(stack);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        int pop_v = stack.pop();
        System.out.println("pop : " + pop_v);

        stack.printStack();
    }
}