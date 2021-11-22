package exam.ay1819s2.Q3b;

import java.util.Random;

class Configurator {
    private int status;

    public Configurator() {
        this.status = -1;
    }

    public boolean check() {
        return new Random().nextBoolean();
    }

    public double getConfigA() {
        return new Random().nextDouble() * 99 * 2;
    }

    public void q3() {
        Runner r1 = new Runner(this);
        status = r1.startTest();
    }
}
