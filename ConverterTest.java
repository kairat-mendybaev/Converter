import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void DecimalToBinary(){
        Converter binary = new Converter();
        assertEquals("1010", binary.DecimalToBinary(Integer.parseInt("10")));
    }

    @Test
    void Decimal15ShouldReturnBinary1111(){
        var binary = new Converter();
        assertEquals("1111", binary.DecimalToBinary(Integer.parseInt("15")));
    }

    @Test
    void DecimalToOctal(){
        Converter octal = new Converter();
        assertEquals(12, octal.DecimalToOctal(10));
    }

    @Test
    void Decimal8ShouldReturnOctal10(){
        var octal = new Converter();
        assertEquals(10, octal.DecimalToOctal(8));
    }

    @Test
    void DecimalToHexa(){
        Converter hexa = new Converter();
        assertEquals("c", hexa.DecimalToHexa(Integer.parseInt("12")));
    }

    @Test
    void Decimal14ShouldReturnHexaE(){
        var hexa = new Converter();
        assertEquals("e",hexa.DecimalToHexa(Integer.parseInt("14")));
    }

    @Test
    void NegativeNumbers(){
        Converter number = new Converter();
        assertEquals(-1, number.Error(-1));
    }

    @Test
    void OverLimitNumbers(){
        Converter number = new Converter();
        assertEquals(17, number.Error(17));
    }
}
