package behavioral.visitor;

import behavioral.visitor.models.Computer;

public class demo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
