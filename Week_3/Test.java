class SwitchTest3 {
    SwitchTest3 (int in) {
        int result;
        result = switch(in) {
            case 1, 2 -> {
                int temp = in;
                yield temp;
            }
            default -> {
                yield 20;
            }
        };

        System.out.println(result);
    }
}

class SwitchTest2 {
    SwitchTest2 (int in) {
        switch(in) {
            case 1, 2 -> {
                in += 1;
                System.out.println("case 1,2  / current in : " + in);
            }
            default -> System.out.println("default");
        }
    }
}

class SwitchTest {
    SwitchTest (int in) {
        switch(in) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}

class StringComp {
    StringComp () {
        String a = "Hello!";
        String b = new String("Hello!");
        String c = a;

        // 아래 삼항 연산자와 동일한 if/else 구
        if(a == c) {
            System.out.println("a == c");
        } else {
            System.out.println("a != c");
        }

        // 삼항 연산자 사용
        String result = (a==c) ? "a == c" : "a != c";

        System.out.println(result);

        if(a == b){
            System.out.println("a == b");
        }
        else if (a.equals(b)) {
            System.out.println("a.equals(b)");
        }
        else {
            System.out.println("a != b");
        }
    }
}

class BitOp {
    BitOp () {
        int bit_val = 5;
        int bit_val2 = 1;

        System.out.println("& op : " + (bit_val & bit_val2));
        System.out.println("| op : " + (bit_val | bit_val2));
        System.out.println("^ op : " + (bit_val ^ bit_val2));
        System.out.println("<< op : " + (bit_val << bit_val2));
        System.out.println(">> op : " + (bit_val >> bit_val2));
    }
}

class OperatorTest {
    OperatorTest () {
        int i_val = 3;
        double d_val = 3.3d;
        float f_val = 3.3f;
        long l_val = 3L;

        System.out.println("=======( + 연산)=======" );
        System.out.println(" + : " + (i_val+2));
        System.out.println(" + : " + (d_val+2.0d));
        System.out.println(" + : " + (f_val+2.0f));
        System.out.println(" + : " + (l_val+2L));

        System.out.println("=======( - 연산)=======" );
        System.out.println(" - : " + (i_val-2));
        System.out.println(" - : " + (d_val-2.0d));
        System.out.println(" - : " + (f_val-2.0f));
        System.out.println(" - : " + (l_val-2L));

        System.out.println("=======( * 연산)=======" );
        System.out.println(" * : " + (i_val*2));
        System.out.println(" * : " + (d_val*2.0d));
        System.out.println(" * : " + (d_val*2));
        System.out.println(" * : " + (f_val*2.0f));
        System.out.println(" * : " + (l_val*2L));

        System.out.println("=======( / 연산)=======" );
        System.out.println(" / : " + (i_val/2));
        System.out.println(" / : " + (d_val/2.0d));
        System.out.println(" / : " + (f_val/2.0f));
        System.out.println(" / : " + (l_val/2L));

        System.out.println("=======( % 연산)=======" );
        System.out.println(" % : " + (i_val%2));
        System.out.println(" % : " + (d_val%2.0d));
        System.out.println(" % : " + (f_val%2.0f));
        System.out.println(" % : " + (l_val%2L));
    }
}

class StringTest {
    StringTest() {
        String st1 = "I'm ";
        String st2 = "from Korea";

        System.out.println(st1 + st2);
    }
}

public class Test {
    public static void main(String[] args) {

        SwitchTest3 st = new SwitchTest3(2);
    }
}
