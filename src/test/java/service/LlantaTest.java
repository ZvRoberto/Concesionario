package service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LlantaTest {

    @Test
    public void testToString() {
        Llanta llanta = new Llanta(10);
        String esperado = "Llanta con rin: 10";
        assertEquals(esperado, llanta.toString());
    }
}

