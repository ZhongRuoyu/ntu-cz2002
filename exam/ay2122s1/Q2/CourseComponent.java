package exam.ay2122s1.Q2;

class CourseComponent {
    private String componentName;
    private float percentage;
    private float score;

    public CourseComponent(String componentName, float percentage,
        float score) {
        this.componentName = componentName;
        this.percentage = percentage;
        this.score = score;
    }

    public float getPercentage() {
        return percentage;
    }

    public float getScore() {
        return score;
    }
}
