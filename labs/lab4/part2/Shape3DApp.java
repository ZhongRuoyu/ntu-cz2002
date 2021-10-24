package labs.lab4.part2;

import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total number of shapes: ");
        int shapeCount = in.nextInt();
        Shape3D[] shapes = new Shape3D[shapeCount];

        System.out.println("Enter 1 for sphere, 2 for square-based pyramid, "
                + "3 for cuboid, 4 for cone, 5 for cylinder.");
        for (int i = 0; i < shapeCount; ++i) {
            while (true) {
                System.out.printf("Choose the shape for shape %d: ", i + 1);
                int choice = in.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.print("Enter the radius for the sphere: ");
                        double radius = in.nextDouble();
                        shapes[i] = new Sphere(radius);
                        break;
                    }
                    case 2: {
                        System.out.print("Enter the base side for the "
                                + "square-based pyramid: ");
                        double baseSide = in.nextDouble();
                        System.out.print("Enter the height for the "
                                + "square-based pyramid: ");
                        double height = in.nextDouble();
                        shapes[i] = new Pyramid(baseSide, height);
                        break;
                    }
                    case 3: {
                        System.out.print("Enter the side a for the cuboid: ");
                        double a = in.nextDouble();
                        System.out.print("Enter the side b for the cuboid: ");
                        double b = in.nextDouble();
                        System.out.print("Enter the side c for the cuboid: ");
                        double c = in.nextDouble();
                        shapes[i] = new Cuboid(a, b, c);
                        break;
                    }
                    case 4: {
                        System.out
                                .print("Enter the base radius for the cone: ");
                        double baseRadius = in.nextDouble();
                        System.out.print("Enter the height for the cone: ");
                        double height = in.nextDouble();
                        shapes[i] = new Cone(baseRadius, height);
                        break;
                    }
                    case 5: {
                        System.out.print(
                                "Enter the base radius for the cylinder: ");
                        double baseRadius = in.nextDouble();
                        System.out.print("Enter the height for the cylinder: ");
                        double height = in.nextDouble();
                        shapes[i] = new Cylinder(baseRadius, height);
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
            System.out.println("Enter 1 for area, 2 for volume.");
            int choice;
            while (true) {
                System.out.print("Choose the type of calculation: ");
                choice = in.nextInt();
                switch (choice) {
                    case 1: {
                        double totalArea = 0;
                        for (Shape3D shape : shapes) {
                            totalArea += shape.area();
                        }
                        System.out.printf("The total area is %f.\n", totalArea);
                        break;
                    }
                    case 2: {
                        double totalVolume = 0;
                        for (Shape3D shape : shapes) {
                            totalVolume += shape.volume();
                        }
                        System.out.printf("The total volume is %f.\n",
                                totalVolume);
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
