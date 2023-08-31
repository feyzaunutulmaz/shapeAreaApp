import context.ShapeAreaCalculator;
import strategies.CircleAreaStrategy;
import strategies.RectangleAreaStrategy;
import strategies.Circle;
import strategies.Rectangle;

public class Main {
    public static void main(String[] args) {
        ShapeAreaCalculator areaCalculator = new ShapeAreaCalculator();

        // Implement Circle Area Strategy
        areaCalculator.setAreaStrategy(new CircleAreaStrategy());
        double circleArea = areaCalculator.calculateArea(new Circle(5.0));
        System.out.println("Circle Area: " + circleArea);

        // Implement Rectangle Area Strategy
        areaCalculator.setAreaStrategy(new RectangleAreaStrategy());
        double rectangleArea = areaCalculator.calculateArea(new Rectangle(3.0, 4.0));
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}