package behavioral.visitor;

import behavioral.visitor.models.Computer;
import behavioral.visitor.models.Keyboard;
import behavioral.visitor.models.Monitor;
import behavioral.visitor.models.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}