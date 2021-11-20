#include <iostream>

class A {
    friend int doubleIt(A a);

   protected:
    int a, b;

   public:
    A(int x, int y) {
        a = x;
        b = y;
    }

    A(int y) {
        a = 0;
        b = y;
    }

    virtual void print();

    A operator+(A a) { return A(this->a + a.a, this->b + a.b); }
};

class B : public A {
   private:
    float p, q;

   public:
    B(int m, int n, float u, float v) : A(m, n) {
        p = u;
        q = v;
    }

    B() : A(0, 0) { p = q = 0; }

    void input(float u, float v);

    virtual void print();
};

void A::print(void) { std::cout << "A values: " << a << " " << b << "\n"; }

void B::print(void) { std::cout << "B values: " << p << " " << q << "\n"; }

void B::input(float x, float y) {
    p = x;
    q = y;
}

int doubleIt(A a) { return a.a * a.a; }

int main() {
    A a1(10, 20);
    A *ptr;
    B b1;
    b1.input(7.5, 3.142);

    ptr = &a1;
    ptr->print();
    ptr = &b1;
    ptr->print();
}
