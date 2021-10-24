package labs.lab4.part2;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return super.getLength();
    }
}
