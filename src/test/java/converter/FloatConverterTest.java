package converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FloatConverterTest {

    EasyConverter converter = new EasyConverter();

    @Test
    void toFloatTest() {
        Float f = converter.toFloat(34.55D);
        assertEquals(34.55F, f);
    }
}
