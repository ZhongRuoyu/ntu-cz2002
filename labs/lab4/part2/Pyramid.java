package labs.lab4.part2;

public class Pyramid implements Shape3D {
    private double baseSide;
    private double height;

    public Pyramid(double baseSide, double height) {
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double area() {
        return baseSide * (baseSide + 2.0
                * Math.sqrt(0.25 * baseSide * baseSide + height * height));
    }

    @Override
    public double volume() {
        return 1.0 / 3.0 * baseSide * baseSide * height;
    }

    public double getBaseSide() {
        return baseSide;
    }

    public double getHeight() {
        return height;
    }
}
