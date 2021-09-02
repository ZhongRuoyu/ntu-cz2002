package labs.lab1;

import java.util.Scanner;
import java.lang.Character;

public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice = in.nextLine().charAt(0);
        switch (Character.toLowerCase(choice)) {
            case 'a':
                System.out.printf("Action movie fan\n");
                break;
            case 'c':
                System.out.printf("Comedy movie fan\n");
                break;
            case 'd':
                System.out.printf("Drama movie fan\n");
                break;
            default:
                System.out.printf("Invalid choice\n");
                break;
        }
        in.close();
    }
}
