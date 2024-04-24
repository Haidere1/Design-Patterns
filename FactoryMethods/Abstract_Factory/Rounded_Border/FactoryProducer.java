package FactoryMethods.Abstract_Factory.Rounded_Border;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean DoubleBordered){   
        if(DoubleBordered){
           return new DoubleBorderedFactory();         
        }else {
           return new SingleBorderedFactory();
        }
        
     }
       
    }
 