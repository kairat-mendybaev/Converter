import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    void DecimalToBinary(){
        Converter binary = new Converter();
        assertEquals("1010", binary.DecimalToBinary(Integer.parseInt("10")));
    }
    @Test
    void DecimalToOctal(){
        Converter octal = new Converter();
        assertEquals(12, octal.DecimalToOctal(10));
    }
    @Test
    void DecimalToHexa(){
        Converter hexa = new Converter();
        assertEquals("c", hexa.DecimalToHexa(Integer.parseInt("12")));
    }

}