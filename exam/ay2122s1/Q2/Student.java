package exam.ay2122s1.Q2;

abstract class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public abstract float calOverall();
}
