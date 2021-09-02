package labs.lab1;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        if (height <= 0) {
            System.out.println("Error input");
        } else {
            for (int i = 1; i <= height; ++i) {
                for (int j = 0; j < i; ++j) {
                    System.out.print(((i + j) % 2 == 1) ? "AA" : "BB");
                }
                System.out.println();
            }
        }
        in.close();
    }
}
