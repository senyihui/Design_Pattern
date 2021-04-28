package creational.builder.model;

import creational.builder.interfaces.Item;
import creational.builder.interfaces.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
