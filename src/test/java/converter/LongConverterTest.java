package converter;

import org.junit.jupiter.api.Test;

public class LongConverterTest {

    ValueConverter converter = new ValueConverter();

    @Test
    void floatToLong() {
        Long aLong = converter.toLong(123.123F);
    }
}
