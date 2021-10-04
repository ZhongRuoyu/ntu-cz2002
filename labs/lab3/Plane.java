package labs.lab3;

import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private static final int NSEATS = 12;

    private PlaneSeat[] seat;
    private int numEmptySeat;

    public Plane() {
        seat = new PlaneSeat[NSEATS];
        for (int i = 0; i < seat.length; ++i) {
            seat[i] = new PlaneSeat(i + 1);
        }
        numEmptySeat = seat.length;
    }

    private PlaneSeat[] sortSeats() {
        PlaneSeat[] sorted = seat.clone();
        Arrays.sort(sorted, Comparator.comparing(PlaneSeat::getCustomerId));
        return sorted;
    }

    public void showNumEmptySeats() {
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        if (numEmptySeat > 0) {
            for (int i = 0; i < seat.length; ++i) {
                if (!seat[i].isOccupied()) {
                    System.out.println("SeatID " + seat[i].getSeatId());
                }
            }
        } else {
            System.out.println("(No empty seats.)");
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        PlaneSeat[] seats = bySeatId ? this.seat : sortSeats();
        System.out.println("The seat assignments are as follow:");
        if (numEmptySeat == seat.length) {
            System.out.println("(No seats assigned.)");
        } else {
            for (int i = 0; i < seats.length; ++i) {
                if (seats[i].isOccupied()) {
                    System.out.println("SeatID " + seats[i].getSeatId()
                            + " assigned to CustomerID "
                            + seats[i].getCustomerId() + ".");
                }
            }
        }
    }

    public void assignSeat(int seatId, int custId) {
        for (int i = 0; i < seat.length; ++i) {
            if (seat[i].getSeatId() == seatId) {
                if (seat[i].isOccupied()) {
                    System.err.println("Seat already assigned to a customer.");
                } else {
                    seat[i].assign(custId);
                    --numEmptySeat;
                    System.out.println("Seat Assigned!");
                }
                return;
            }
        }
        System.err.println("Seat not found.");
    }

    public void unAssignSeat(int seatId) {
        for (int i = 0; i < seat.length; ++i) {
            if (seat[i].getSeatId() == seatId) {
                if (seat[i].isOccupied()) {
                    seat[i].unAssign();
                    ++numEmptySeat;
                    System.out.println("Seat Unassigned!");
                } else {
                    System.err.println("Seat has not been assigned.");
                }
                return;
            }
        }
        System.err.println("Seat not found.");
    }
}
