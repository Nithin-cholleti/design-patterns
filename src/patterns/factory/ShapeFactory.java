package patterns.factory;

public class ShapeFactory {
    public Shape getShape(String shape){
        switch (shape){
            case "C" : return new Circle();
            case "R" : return new Rectangle();
            case "S" : return new Square();
            default: return null;
        }
    }
}
