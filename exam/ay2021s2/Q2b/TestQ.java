package exam.ay2021s2.Q2b;

public class TestQ {
    public static void main(String[] args) {
        X x1 = new Z(); // line 1
        x1.compare(10, 10); // line 2
        Y y1 = (Y) x1; // line 3
        y1.compare(10, 20); // line 4
    }
}

/**
 * equal in Z
 * different in Z
 */
