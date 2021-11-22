package exam.ay1819s2.Q1a;

abstract class RobotCat extends Cat implements Robot {
    @Override
    public void powerOn() {
        System.out.println("powerOn");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
