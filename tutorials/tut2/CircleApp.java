package tutorials.tut2;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("==== Circle Computation =====");
        System.out.println("|1. Create a new circle     |");
        System.out.println("|2. Print Area              |");
        System.out.println("|3. Print circumference     |");
        System.out.println("|4. Quit                    |");
        System.out.println("=============================");

        Circle circle = new Circle(0);

        while (true) {
            System.out.println("Choose option (1-3):");
            int choice = in.nextInt();
            if (choice < 1 || choice > 4) {
                System.err.println("Unknown option.");
                break;
            } else if (choice == 4) {
                System.out.println("Thank you!!");
                break;
            }
            switch (choice) {
                case 1: {
                    System.out.println("Enter the radius to compute the area and circumference");
                    double radius = in.nextDouble();
                    circle = new Circle(radius);
                    System.out.println("A new circle is created");
                    break;
                }
                case 2: {
                    circle.printArea();
                    break;
                }
                case 3: {
                    circle.printCircumference();
                    break;
                }
            }
        }

        in.close();
    }
}
