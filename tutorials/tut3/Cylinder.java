package tutorials.tut3;

public class Cylinder extends Circle {
    protected int h;
    
    public Cylinder(int x, int y, int r, int h) {
        super(x, y, r);
        this.h = h;
    }

    public void setHeight(int h) {
        this.h = h;
    }

    public int getHeight() {
        return h;
    }

    public String toString() {
        return "[ " + x + ", " + y + ", " + r + ", " + h + " ]";
    }

    public double volume() {
        return area() * h;
    }
}
