package tutorials.tut3;

public class Circle extends Point {
    protected int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public void setRadius(int r) {
        this.r = r;
    }

    public int getRadius() {
        return r;
    }

    public String toString() {
        return "[ " + x + ", " + y + ", " + r + " ]";
    }

    public double area() {
        return Math.PI * r * r;
    }
}
