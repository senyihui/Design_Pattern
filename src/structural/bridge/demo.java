package structural.bridge;

import structural.bridge.interfaces.Shape;
import structural.bridge.model.Circle;
import structural.bridge.model.GreenCircle;
import structural.bridge.model.RedCircle;

public class demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
