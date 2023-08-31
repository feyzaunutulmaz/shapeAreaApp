package strategies;

public class RectangleAreaStrategy implements AreaCalculationStrategy {
    @Override
    public double calculateArea(Shape shape) {

        Rectangle rectangle = (Rectangle) shape;
        return rectangle.getArea();

    }
}
