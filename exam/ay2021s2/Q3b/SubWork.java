package exam.ay2021s2.Q3b;

import java.util.ArrayList;

class SubWork {
    private Work work;

    public SubWork(Work work) {
        this.work = work;
    }

    public void process(ArrayList<?> ar2) {
        System.out.println("process: " + ar2);
    }
}
