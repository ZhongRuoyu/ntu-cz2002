package exam.ay2122s1.Q2;

public class StudentApp {
    private static void printOverall(Student student) {
        float overall = student.calOverall();
        System.out.println("Overall score: " + overall);
    }

    public static void main(String[] args) {
        Undergraduate benjamin =
            new Undergraduate("Benjamin", 0.3f, 80, 0.7f, 70);
        Graduate stephanie =
            new Graduate("Stephanie", 0.3f, 100, 0.3f, 100, 0.4f, 100);
        printOverall(benjamin);
        printOverall(stephanie);
    }
}
