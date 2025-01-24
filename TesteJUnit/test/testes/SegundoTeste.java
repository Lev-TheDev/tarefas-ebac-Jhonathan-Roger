package testes;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTeste {
    @Test
    public void test2() {
        String nome = "Levino";
        Assert.assertEquals("Levino", nome);
    }
}
