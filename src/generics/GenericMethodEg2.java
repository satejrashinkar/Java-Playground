package generics;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T operand1, T operand2) {
        return switch (this) {
            case ADD -> operand1.doubleValue() + operand2.doubleValue();
            case SUBTRACT -> operand1.doubleValue() - operand2.doubleValue();
            case MULTIPLY -> operand1.doubleValue() * operand2.doubleValue();
            case DIVIDE -> operand1.doubleValue() / operand2.doubleValue();
            default -> throw new AssertionError("Unknown Operation : " + this);
        };
    }
}

public class GenericMethodEg2 {
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(10, 15));
        System.out.println(Operation.MULTIPLY.apply(10, 15));
    }
}
