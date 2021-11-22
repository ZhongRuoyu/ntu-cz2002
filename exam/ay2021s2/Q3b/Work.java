package exam.ay2021s2.Q3b;

import java.util.ArrayList;

class Work {
    private String title;
    private SubWork sub;

    public Work(String title) {
        this.title = title;
    }

    public void init() {
        System.out.println("init");
    }

    public void process(ArrayList<?> ar1) {
        System.out.println("process: " + ar1);
    }

    private void distribute(ArrayList<?> ar1) {
        ArrayList<?> ar2 = filter(ar1);
        sub.process(ar2);
    }

    private ArrayList<?> filter(ArrayList<?> ar1) {
        ArrayList<?> ar2 = new ArrayList<>(ar1);
        return ar2;
    }

    public String getData() {
        String data = loadData();
        return data;
    }

    private String loadData() {
        String data = "data";
        return data;
    }
}
