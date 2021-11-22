package exam.ay1819s2.Q2b;

public class Test2 {
    public static void main(String[] args) {
        AA a = new AA(); // line 1
        A1 a1 = new A1(); // line 2
        A2 a2 = new A2(4); // line 3
        a2.print(); // line 4
        a1.print(); // line 5
    }
}

/**
 * 10
 * 0
 * 10
 * 0
 * A1
 * A2 print
 * 0
 * A2
 * A2 print
 * 1
 * 10
 * 1
 */
