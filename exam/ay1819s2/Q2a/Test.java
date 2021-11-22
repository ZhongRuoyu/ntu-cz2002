package exam.ay1819s2.Q2a;

public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.fun(6); // line 1
        D d = new D();
        d.fun(6); // line 2
        A x = new C();
        x.fun(6); // line 3
        B y = new D();
        y.fun(6); // line 4
        B z = new E();
        z.fun(6); // line 5
    }
}

/**
 * C
 * B
 * A
 * B
 * F
 */
