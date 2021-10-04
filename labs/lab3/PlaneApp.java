package labs.lab3;

import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Plane plane = new Plane();

        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments by seat ID");
        System.out.println(
                "(4) Show the list of seat assignments by customer ID");
        System.out.println("(5) Assign a customer to a seat");
        System.out.println("(6) Remove a seat assignment");
        System.out.println("(7) Exit");
        System.out.println();

        while (true) {
            System.out.print("Enter the number of your choice: ");
            int choice = in.nextInt();
            if (choice < 1 || choice > 7) {
                System.err.println("Choice unknown.");
                System.out.println();
                continue;
            } else if (choice == 7) {
                break;
            }
            switch (choice) {
                case 1: {
                    plane.showNumEmptySeats();
                    System.out.println();
                    break;
                }
                case 2: {
                    plane.showEmptySeats();
                    System.out.println();
                    break;
                }
                case 3: {
                    plane.showAssignedSeats(true);
                    System.out.println();
                    break;
                }
                case 4: {
                    plane.showAssignedSeats(false);
                    System.out.println();
                    break;
                }
                case 5: {
                    System.out.println("Assigning Seat ..");
                    System.out.print("Please enter SeatID: ");
                    int seatId = in.nextInt();
                    System.out.print("Please enter Customer ID: ");
                    int customerId = in.nextInt();
                    plane.assignSeat(seatId, customerId);
                    System.out.println();
                    break;
                }
                case 6: {
                    System.out
                            .print("Enter SeatID to unassign customer from: ");
                    int seatId = in.nextInt();
                    plane.unAssignSeat(seatId);
                    System.out.println();
                    break;
                }
                default: {
                    break;
                }
            }
        }

        in.close();
    }
}
