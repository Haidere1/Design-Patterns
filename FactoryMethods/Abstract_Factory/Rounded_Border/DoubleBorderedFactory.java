package FactoryMethods.Abstract_Factory.Rounded_Border;

public class DoubleBorderedFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){    
       if(shapeType.equalsIgnoreCase("Double Bordered Triangle")){
          return new DoubleBorderedTriangle();         
       }else if(shapeType.equalsIgnoreCase("Double Borderd Rounded Triangle")){
          return new DoubleBorderedRoundedTriangle();
       }	
      
       return null;
    }
 }
    

