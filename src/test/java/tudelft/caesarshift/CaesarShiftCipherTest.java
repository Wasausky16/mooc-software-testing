package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarShiftCipherTest {

    @Test
    public void testSimpleShift() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        String resultado = cifrador.applyShift("abc", 3);
        assertEquals("def", resultado);
    }

    @Test
    public void testNegativeShift() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        String resultado = cifrador.applyShift("def", -3);
        assertEquals("abc", resultado);
    }

    @Test
    public void testWithInvalidChar() {
        CaesarShiftCipher cifrador = new CaesarShiftCipher();
        String resultado = cifrador.applyShift("hola!", 3);
        assertEquals("invalid", resultado);
    }

}
