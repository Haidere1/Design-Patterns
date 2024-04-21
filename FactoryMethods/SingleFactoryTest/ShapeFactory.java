package FactoryMethods.SingleFactoryTest;

import FactoryMethods.Classifiers.Circle;
import FactoryMethods.Classifiers.Shape;
import FactoryMethods.Classifiers.Square;
import FactoryMethods.Classifiers.Triangle;

public class ShapeFactory {

    public static Shape createShape(String type) {
        if (type == null) {
            return null;
        }
        
        if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        
        return null;
    }
}
