package converter;

import org.junit.jupiter.api.Test;

public class LongConverterTest {

    EasyConverter converter = new EasyConverter();

    @Test
    void floatToLong() {
        Long aLong = converter.toLong(123.123F);
    }
}
