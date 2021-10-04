package labs.lab3;

public class PlaneSeat {
    private static final int UNASSIGNED_ID = -1;

    private final int seatId;
    private boolean assigned = false;
    private int customerId = UNASSIGNED_ID;

    public PlaneSeat(int seatId) {
        this.seatId = seatId;
    }

    public int getSeatId() {
        return seatId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public boolean isOccupied() {
        return assigned;
    }

    public void assign(int custId) {
        assigned = true;
        this.customerId = custId;
    }

    public void unAssign() {
        assigned = false;
        customerId = UNASSIGNED_ID;
    }
}
