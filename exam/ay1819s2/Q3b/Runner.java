package exam.ay1819s2.Q3b;

class Runner {
    private Configurator cfr;

    public Runner(Configurator cfr) {
        this.cfr = cfr;
    }

    public int startTest() {
        int status = start();
        return status;
    }

    private int start() {
        int status = -1;
        boolean result = validate();
        if (!result) {
            return 0;
        }
        double valA = cfr.getConfigA();
        if (valA > 99) {
            Runner r2 = new Runner(cfr);
            status = r2.startTest();
        }
        return status;
    }

    private boolean validate() {
        boolean result = cfr.check();
        return result;
    }
}
