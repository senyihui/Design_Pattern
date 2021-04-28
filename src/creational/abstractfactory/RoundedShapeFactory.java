package creational.abstractfactory;

import creational.abstractfactory.interfaces.AbstractFactory;
import creational.abstractfactory.interfaces.Shape;
import creational.abstractfactory.model.RoundedRectangle;
import creational.abstractfactory.model.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}