package annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR})
//@Target({ElementType.FIELD, ElementType.TYPE}) consegue usar na classe e nas variáveis
public @interface PrimeiraAnotacao {

    String value();

    String[] bairros();

    double valores() default 10d;
}
