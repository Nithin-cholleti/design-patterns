package patterns.factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("C");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("R");
        rectangle.draw();

        Shape square = shapeFactory.getShape("S");
        square.draw();

    }
}
