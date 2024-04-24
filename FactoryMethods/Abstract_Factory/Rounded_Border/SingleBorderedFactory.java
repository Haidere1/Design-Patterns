package FactoryMethods.Abstract_Factory.Rounded_Border;

public class SingleBorderedFactory extends AbstractFactory {
    public Shape getShape(String shapeType){    
        if(shapeType.equalsIgnoreCase("Single Bordered Triangle")){
           return new SingleBorderTriangle();         
        }else if(shapeType.equalsIgnoreCase("Single Borderd Rounded Triangle")){
           return new SingleBorderedRounded();
        }	
       
        return null;
     }
    
}
