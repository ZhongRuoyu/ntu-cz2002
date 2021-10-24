package labs.lab4.part2;

public class Triangle implements Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return 0.5 * height * base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}
