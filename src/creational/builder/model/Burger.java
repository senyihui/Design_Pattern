package creational.builder.model;

import creational.builder.interfaces.Item;
import creational.builder.interfaces.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
