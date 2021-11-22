package exam.ay1819s2.Q2b;

class A2 extends AA {
    A2(int a) {
        super(a);
        System.out.println("A2");
    }

    void print() {
        System.out.println("A2 print");
        System.out.println(super.b);
    }
}
