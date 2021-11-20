package tutorials.tut5;

public class Rectangle extends Polygon {
    public Rectangle(String name, float width, float height) {
        super(name, width, height);
        polytype = KindofPolygon.POLY_RECT;
    }

    @Override
    public float calArea() {
        return width * height;
    }
}
