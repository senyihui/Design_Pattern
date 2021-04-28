package creational.abstractfactory;

import creational.abstractfactory.interfaces.AbstractFactory;
import creational.abstractfactory.interfaces.Shape;
import creational.abstractfactory.model.Rectangle;
import creational.abstractfactory.model.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
