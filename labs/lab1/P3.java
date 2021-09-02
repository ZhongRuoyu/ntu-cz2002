package labs.lab1;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double RATE = 1.82;
        System.out.print("Enter starting value: ");
        int start = in.nextInt();
        System.out.print("Enter ending value: ");
        int end = in.nextInt();
        System.out.print("Enter increment: ");
        int inc = in.nextInt();

        if (start > end) {
            System.out.println("Error input");
        } else {
            System.out.println("US$         S$");
            System.out.println("--------------");
            for (int i = start; i <= end; i += inc) {
                System.out.printf("%-12d%.2f\n", i, i * RATE);
            }
            System.out.println();

            System.out.println("US$         S$");
            System.out.println("--------------");
            {
                int i = start;
                while (i <= end) {
                    System.out.printf("%-12d%.2f\n", i, i * RATE);
                    i += inc;
                }
            }
            System.out.println();

            System.out.println("US$         S$");
            System.out.println("--------------");
            {
                int i = start;
                do {
                    System.out.printf("%-12d%.2f\n", i, i * RATE);
                    i += inc;
                } while (i <= end);
            }
            System.out.println();
        }

        in.close();
    }
}
