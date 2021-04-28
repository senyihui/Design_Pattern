package creational.abstractfactory.model;

import creational.abstractfactory.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
