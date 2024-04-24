package FactoryMethods.Abstract_Factory.SimpleShape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){    
       if(shapeType.equalsIgnoreCase("RECTANGLE")){
          return new RoundedRectangle();         
       }else if(shapeType.equalsIgnoreCase("SQUARE")){
          return new RoundedSquare();
       }	
       else if(shapeType.equalsIgnoreCase("Triangle"))
       {
        return new DifferentTriangle();
       }
       return null;
    }
 }