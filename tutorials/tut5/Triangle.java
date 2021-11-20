package tutorials.tut5;

public class Triangle extends Polygon {
    public Triangle(String name, float width, float height) {
        super(name, width, height);
        polytype = KindofPolygon.POLY_TRIANG;
    }

    @Override
    public float calArea() {
        return width * height / 2.0f;
    }
}
