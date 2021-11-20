package tutorials.tut5;

public class TestPolygon {
    // public static void printArea(Rectangle r) {
    // System.out.printf("Rectangle: Area = %f%n", r.calArea());
    // }

    // public static void printArea(Triangle t) {
    // System.out.printf("Triangle: Area = %f%n", t.calArea());
    // }

    public static void printArea(Polygon p) {
        System.out.printf("Polygon: Area = %f%n", p.calArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle", 1.0f, 1.0f);
        Triangle triangle = new Triangle("Triangle", 1.0f, 1.0f);

        // System.out.println("Static binding");
        // printArea(rectangle);
        // printArea(triangle);
        // System.out.println();

        System.out.println("Dynamic binding");
        System.out.printf("Rectangle: Area = %f%n", rectangle.calArea());
        System.out.printf("Triangle: Area = %f%n", triangle.calArea());
        System.out.println();
    }
}
