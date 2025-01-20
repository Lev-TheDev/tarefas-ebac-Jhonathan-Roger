import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class ProgramLambda {
    public static void main(String[] args) {

        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };
        intBinaryOperator.applyAsInt(1,1);

        IntBinaryOperator ope = new intBinaryOperatorClass();
        int result1 = ope.applyAsInt(1, 1);
        System.out.println(result1);

        Long returnL = calcular(1l,2l, (Long v1, Long v2) -> {
            return v1+v2;
        });
        System.out.println(returnL);
    }

    private static Long calcular(Long t, Long u, BiFunction<Long,Long,Long> function) {
        return function.apply(t,u);
    }
}