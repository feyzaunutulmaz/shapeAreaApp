package strategies;

public class CircleAreaStrategy implements AreaCalculationStrategy {
    
    @Override
    public double calculateArea(Shape shape) {
        Circle circle = (Circle) shape;
        return circle.getArea();
    }
}
