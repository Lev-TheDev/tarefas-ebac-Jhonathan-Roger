package testes;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {
        @Test
        public void test() {
            String nome = "Levino";
            Assert.assertEquals("Levino", nome);
        }

        @Test
        public void testNotEquals() {
            String nome = "Levino";
            Assert.assertNotEquals("Levino1", nome);
        }
}


