package behavioral.visitor.models;

import behavioral.visitor.ComputerPart;
import behavioral.visitor.ComputerPartVisitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}