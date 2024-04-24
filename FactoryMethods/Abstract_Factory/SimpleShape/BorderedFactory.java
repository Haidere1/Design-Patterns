package FactoryMethods.Abstract_Factory.SimpleShape;

public class BorderedFactory {
    public static AbstractFactory getFactory(boolean SingleBordered){   
        if(SingleBordered){
           return new RoundedShapeFactory();         
        }else {
           return new ShapeFactory();
        }
        
     }
}
