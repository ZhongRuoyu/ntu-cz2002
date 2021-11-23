package exam.ay2122s1.Q2;

class Undergraduate extends Student {
    private CourseComponent assignment;
    private CourseComponent finalExam;

    public Undergraduate(String name, float assignmentPercentage,
        float assignmentScore, float finalExamPercentage,
        float finalExamScore) {
        super(name);
        this.assignment = new CourseComponent("Assignment",
            assignmentPercentage, assignmentScore);
        this.finalExam = new CourseComponent("Final Exam", finalExamPercentage,
            finalExamScore);
    }

    @Override
    public float calOverall() {
        float assignmentScore =
            assignment.getPercentage() * assignment.getScore();
        float finalExamScore = finalExam.getPercentage() * finalExam.getScore();
        return assignmentScore + finalExamScore;
    }
}
