package service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    public void testCarroTieneCuatroLlantas() {
        Carro carro = new Carro();
        String resultado = carro.toString();

        assertTrue(resultado.contains("1. Llanta con rin: 10"));
        assertTrue(resultado.contains("2. Llanta con rin: 10"));
        assertTrue(resultado.contains("3. Llanta con rin: 10"));
        assertTrue(resultado.contains("4. Llanta con rin: 10"));
    }

    @Test
    public void testToStringNotNull() {
        Carro carro = new Carro();
        assertNotNull(carro.toString());
    }
}
