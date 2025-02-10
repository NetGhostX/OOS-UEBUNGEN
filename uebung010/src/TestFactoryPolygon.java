public class TestFactoryPolygon {
    public static void main(String[] args) {
        PolygonFactory polyType = new PolygonFactory();
        callPolyType(polyType.makePolygon("T"));
    }

    public static void callPolyType(Polygon poly){
        poly.getType();
    }
}
