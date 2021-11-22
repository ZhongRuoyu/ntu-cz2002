package exam.ay1819s2.Q2b;

class AA {
    int a = 10;
    static int b = 0;

    AA() {
        print();
    }

    AA(int a) {
        this.a = a;
        print();
        b++;
    }

    void print() {
        System.out.println(a);
        System.out.println(b);
    }
}
