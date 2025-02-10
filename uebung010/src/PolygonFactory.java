public class PolygonFactory {
    public Polygon makePolygon(String newShapeType){
        Polygon newPoly;
        return switch(newShapeType){
            case "P"-> new Pentagon();
            case "S" -> new Square();
            case "T" -> new Triangle();
            default -> null;
        };
    }
}
