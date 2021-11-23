package exam.ay2122s1.Q2;

class Graduate extends Student {
    private CourseComponent assignment;
    private CourseComponent researchReport;
    private CourseComponent finalExam;

    public Graduate(String name, float assignmentPercentage,
        float assignmentScore, float researchReportPercentage,
        float researchReportScore, float finalExamPercentage,
        float finalExamScore) {
        super(name);
        this.assignment = new CourseComponent("Assignment",
            assignmentPercentage, assignmentScore);
        this.researchReport = new CourseComponent("Research Report",
            researchReportPercentage, researchReportScore);
        this.finalExam = new CourseComponent("Final Exam", finalExamPercentage,
            finalExamScore);
    }

    @Override
    public float calOverall() {
        float assignmentScore =
            assignment.getPercentage() * assignment.getScore();
        float researchReportScore =
            researchReport.getPercentage() * researchReport.getScore();
        float finalExamScore = finalExam.getPercentage() * finalExam.getScore();
        return assignmentScore + researchReportScore + finalExamScore;
    }
}
