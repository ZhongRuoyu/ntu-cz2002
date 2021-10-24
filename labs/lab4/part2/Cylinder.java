package labs.lab4.part2;

public class Cylinder implements Shape3D {
    private double baseRadius;
    private double height;

    public Cylinder(double baseRadius, double height) {
        this.baseRadius = baseRadius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2.0 * Math.PI * baseRadius * (baseRadius + height);
    }

    @Override
    public double volume() {
        return Math.PI * baseRadius * baseRadius * height;
    }

    public double getBaseRadius() {
        return baseRadius;
    }

    public double getHeight() {
        return height;
    }
}
