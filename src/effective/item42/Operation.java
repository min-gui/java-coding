package effective.item42;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    PLUS  ("+", (x, y) -> x + y),
    MINUS ("-", (x, y) -> x - y),
    TIMES ("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator op;

    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }
    @Override public String toString() { return symbol; }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }

    public static void main(String[] args) {
        String[] strings = {"1", "2", "3", "4"};
        double x = Double.parseDouble(strings[0]);
        double y = Double.parseDouble(strings[1]);
        for (Operation op : Operation.values())

            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }

}
