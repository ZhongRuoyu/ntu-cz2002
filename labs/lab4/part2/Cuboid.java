package labs.lab4.part2;

public class Cuboid implements Shape3D {
    private double a;
    private double b;
    private double c;

    public Cuboid(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return 2.0 * (a * b + a * c + b * c);
    }

    @Override
    public double volume() {
        return a * b * c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
