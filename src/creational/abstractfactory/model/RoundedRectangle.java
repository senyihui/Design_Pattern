package creational.abstractfactory.model;

import creational.abstractfactory.interfaces.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw RoundedRectangle");
    }
}
