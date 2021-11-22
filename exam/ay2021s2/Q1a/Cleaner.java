package exam.ay2021s2.Q1a;

abstract class Cleaner extends Employee {
    public void rest() {
        System.out.println("rest");
    }

    @Override
    public void speak() {
        System.out.println("speak");
    }
}
