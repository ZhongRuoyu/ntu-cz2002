package labs.lab4.part2;

public class Cone implements Shape3D {
    private double baseRadius;
    private double height;

    public Cone(double baseRadius, double height) {
        this.baseRadius = baseRadius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * baseRadius * (baseRadius
                + Math.sqrt(baseRadius * baseRadius + height * height));
    }

    @Override
    public double volume() {
        return 1.0 / 3.0 * Math.PI * baseRadius * baseRadius * height;
    }

    public double getBaseRadius() {
        return baseRadius;
    }

    public double getHeight() {
        return height;
    }
}
