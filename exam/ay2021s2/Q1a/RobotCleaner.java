package exam.ay2021s2.Q1a;

class RobotCleaner extends Cleaner implements Computer {
    @Override
    public void work() {
        System.out.println("work");
    }

    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void on() {
        System.out.println("on");
    }

    @Override
    public void off() {
        System.out.println("off");
    }

    @Override
    public void exeProgram() {
        System.out.println("exeProgram");
    }
}
