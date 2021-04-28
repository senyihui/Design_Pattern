package structural.decorator.model;

import structural.decorator.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}