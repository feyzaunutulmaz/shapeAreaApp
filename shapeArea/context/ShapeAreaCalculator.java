package context;

import strategies.AreaCalculationStrategy;
import strategies.Shape;

//context class
public class ShapeAreaCalculator {
    
    private AreaCalculationStrategy areaStrategy;

    public void setAreaStrategy( AreaCalculationStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }
    public double calculateArea(Shape shape) {
        return areaStrategy.calculateArea(shape);
    }
}