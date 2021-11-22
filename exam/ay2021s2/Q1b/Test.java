package exam.ay2021s2.Q1b;

public class Test {
    public static void main(String[] args) {
        B ob = new B();
        C oc = new C();
        ob.method(100);
        oc.method(100);
        ob.method(9.9);
        oc.method(9.9);
    }
}

/**
 * construcotr A
 * construcotr B
 * construcotr A
 * construcotr B
 * construcotr C
 * A1
 * C1
 * B1
 * B1
 */
