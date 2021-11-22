package exam.ay1819s2.Q1b;

import exam.ay1819s2.Q1b.p1.B;
import exam.ay1819s2.Q1b.p1.s1.D;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        D d = new D();

        b.fun(3.14); // line 1
        d.fun(3.14); // line 2
        b.fun("test"); // line 3
        d.fun("test"); // line 4
    }
}

/**
 * AD
 * AD
 * BO
 * DO
 */
