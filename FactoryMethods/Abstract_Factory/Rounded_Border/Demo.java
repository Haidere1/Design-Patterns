package FactoryMethods.Abstract_Factory.Rounded_Border;

public class Demo {
    public static void main(String[] args)
    {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("Single Bordered Triangle");
        //call draw method of Shape Rectangle
        shape1.draw();
        //get an object of Shape Square 
        Shape shape2 = shapeFactory.getShape("Single Borderd Rounded Triangle");
        //call draw method of Shape Square
        shape2.draw();
        
        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("Double Bordered Triangle");
        //call draw method of Shape Rectangle
        shape3.draw();
        Shape shape4 = shapeFactory1.getShape("Double Borderd Rounded Triangle");
        shape4.draw();
    }
    
}
