package converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DoubleConverter {

    ValueConverter converter = new ValueConverter();

    @Test
    void intToDouble() {
        Double d = converter.toDouble(12);
        assertEquals(12D, d);
    }

    @Test
    void floatToDouble() {
        Double d = converter.toDouble(12.34124F);
        assertEquals(12.34124D, d);
    }

    @Test
    void stringToDouble() {
        Double d = converter.toDouble("123.2145124");
        assertEquals(123.2145124D, d);
    }

    @Test
    void stringToDoubleEx() {
        assertThrows(NumberFormatException.class, () -> converter.toDouble("123.123fa"));
    }
}
