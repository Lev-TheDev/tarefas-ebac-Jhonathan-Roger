import java.util.function.IntBinaryOperator;

public class intBinaryOperatorClass implements IntBinaryOperator {

    @Override
    public int applyAsInt(int a, int b) {
        return a + b;
    }
}
