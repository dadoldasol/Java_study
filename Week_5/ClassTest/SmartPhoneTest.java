package javaunittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartPhoneTest {

    @Test
    @DisplayName("new object")
    void newObjectTest() {

        SmartPhone sp = new SmartPhone("s21", "010-0000-0000");
    }
}