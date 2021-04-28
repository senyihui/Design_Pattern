package behavioral.visitor.models;

import behavioral.visitor.ComputerPart;
import behavioral.visitor.ComputerPartVisitor;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
