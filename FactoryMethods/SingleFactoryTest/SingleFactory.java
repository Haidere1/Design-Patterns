package FactoryMethods.SingleFactoryTest;

import java.util.ArrayList;

import FactoryMethods.Classifiers.Shape;

public class SingleFactory {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        // Use the ShapeFactory to create shapes
        Shape circle = ShapeFactory.createShape("circle");
        Shape square = ShapeFactory.createShape("square");
        Shape square2 = ShapeFactory.createShape("triangle"); // Creating another square

        shapes.add(circle);
        shapes.add(square);
        shapes.add(square2);

        for (Shape s : shapes) {
            s.draw();
        }
    }
    
}
