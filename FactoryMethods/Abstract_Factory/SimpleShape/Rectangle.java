package FactoryMethods.Abstract_Factory.SimpleShape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
       System.out.println("\nInside Rectangle::draw() method.");
    }
 }