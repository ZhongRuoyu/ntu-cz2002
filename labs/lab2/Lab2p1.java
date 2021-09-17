package labs.lab2;

import java.util.Scanner;
import java.lang.Math;

public class Lab2p1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: miltiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest(sc);
                    break;
                case 2: /* add divide() call */
                {
                    System.out.print("Enter m: ");
                    int m = sc.nextInt();
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    System.out.printf("%d/%d = %d\n", m, n, divide(m, n));
                    System.out.println();
                }
                    break;
                case 3: /* add modulus() call */
                {
                    System.out.print("Enter m: ");
                    int m = sc.nextInt();
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    System.out.printf("%d %% %d = %d\n", m, n, modulus(m, n));
                    System.out.println();
                }
                    break;
                case 4: /* add countDigits() call */
                {
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    int res = countDigits(n);
                    System.out.printf(res == 0 ? "Error input\n" : ("count = " + res + "\n"));
                    System.out.println();
                }
                    break;
                case 5: /* add position() call */
                {
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    System.out.print("Enter digit: ");
                    int digit = sc.nextInt();
                    System.out.printf("position = %d\n", position(n, digit));
                    System.out.println();
                }
                    break;
                case 6: /* add extractOddDigits() call */
                {
                    System.out.print("Enter n: ");
                    long n = sc.nextLong();
                    long res = extractOddDigits(n);
                    if (res == -2) {
                        System.out.println("Error input");
                    } else {
                        System.out.printf("oddDigits = %d\n", res);
                    }
                    System.out.println();
                }
                    break;
                case 7:
                    System.out.println("Program terminating ....");
            }
        } while (choice < 7);

        sc.close();
    }

    /* add method code here */

    public static void mulTest(Scanner in) {
        final int N = 5;
        int correct = 0;
        for (int i = 0; i < N; ++i) {
            int x = (int) (1 + Math.random() * 9);
            int y = (int) (1 + Math.random() * 9);
            System.out.printf("How much is %d times %d? ", x, y);
            int ans = in.nextInt();
            if (ans == x * y) {
                ++correct;
            }
        }
        System.out.printf("%d %s out of %d %s correct.\n", correct, (correct == 1) ? "answer" : "answers", N,
                (correct == 1) ? "is" : "are");
        System.out.println();
    }

    public static int divide(int m, int n) {
        int res = 0;
        for (; m >= n; m -= n) {
            ++res;
        }
        return res;
    }

    public static int modulus(int m, int n) {
        while (m >= n) {
            m -= n;
        }
        return m;
    }

    public static int countDigits(int n) {
        if (n <= 0) {
            return 0;
        }
        int res = 0;
        for (; n != 0; n /= 10) {
            ++res;
        }
        return res;
    }

    public static int position(int n, int digit) {
        for (int i = 1; n != 0; ++i, n /= 10) {
            if (n % 10 == digit) {
                return i;
            }
        }
        return -1;
    }

    public static long extractOddDigits(long n) {
        if (n <= 0) {
            return -2;
        }

        long temp = 0;
        for (; n != 0; n /= 10) {
            if (n % 10 % 2 == 1) {
                temp = temp * 10 + n % 10;
            }
        }

        long res = 0;
        if (temp == 0) {
            res = -1;
        } else {
            for (; temp != 0; temp /= 10) {
                res = res * 10 + temp % 10;
            }
        }

        return res;
    }
}
