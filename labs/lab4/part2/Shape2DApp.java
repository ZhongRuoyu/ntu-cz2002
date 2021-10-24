package labs.lab4.part2;

import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total number of shapes: ");
        int shapeCount = in.nextInt();
        Shape[] shapes = new Shape[shapeCount];

        System.out.println("Enter 1 for square, 2 for rectangle, "
                + "3 for circle, and 4 for triangle.");
        for (int i = 0; i < shapeCount; ++i) {
            while (true) {
                System.out.printf("Choose the shape for shape %d: ", i + 1);
                int choice = in.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.print("Enter the side for the square: ");
                        double side = in.nextDouble();
                        shapes[i] = new Square(side);
                        break;
                    }
                    case 2: {
                        System.out
                                .print("Enter the length for the rectangle: ");
                        double length = in.nextDouble();
                        System.out
                                .print("Enter the breadth for the rectangle: ");
                        double breadth = in.nextDouble();
                        shapes[i] = new Rectangle(length, breadth);
                        break;
                    }
                    case 3: {
                        System.out.print("Enter the radius for the circle: ");
                        double radius = in.nextDouble();
                        shapes[i] = new Circle(radius);
                        break;
                    }
                    case 4: {
                        System.out.print("Enter the height for the triangle: ");
                        double height = in.nextDouble();
                        System.out.print("Enter the base for the triangle: ");
                        double base = in.nextDouble();
                        shapes[i] = new Triangle(height, base);
                        break;
                    }
                    default: {
                        System.err.println("Choice unknown. Please try again.");
                        continue;
                    }
                }
                break;
            }
        }

        {
            System.out.println("Enter 1 for area.");
            int choice;
            while (true) {
                System.out.print("Choose the type of calculation: ");
                choice = in.nextInt();
                switch (choice) {
                    case 1: {
                        double totalArea = 0;
                        for (Shape shape : shapes) {
                            totalArea += shape.area();
                        }
                        System.out.printf("The total area is %f.\n", totalArea);
                        break;
                    }
                    default: {
                        System.err.println("Choice unknown. Please try again.");
                        continue;
                    }
                }
                break;
            }
        }

        in.close();
    }
}
