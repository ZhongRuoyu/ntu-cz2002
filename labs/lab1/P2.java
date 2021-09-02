package labs.lab1;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = in.nextInt();
        System.out.print("Enter merit points: ");
        int merit = in.nextInt();
        char grade;

        if (salary >= 500 && salary <= 649) {
            grade = (salary >= 600 && merit >= 10) ? 'B' : 'C';
        } else if (salary > 649 && salary <= 799) {
            grade = (salary >= 700 && merit >= 20) ? 'A' : 'B';
        } else if (salary > 799 && salary <= 899) {
            grade = 'A';
        } else {
            grade = '\0';
        }
        
        if (grade != '\0') {
            System.out.println("Grade " + grade);
        } else {
            System.out.println("Grade unknown");
        }

        in.close();
    }
}
