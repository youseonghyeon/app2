package converter;

import exception.NumberOverflowException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntConverterTest {

    EasyConverter converter = new EasyConverter();

    @Test
    void nullToIntTest() {
        assertNull(converter.toInt(null));
    }

    @Test
    void StringToInt() {
        Integer i = converter.toInt("12");
        assertEquals(12, i);
        assertEquals(Integer.class, i.getClass());
    }

    @Test
    void CharToInt() {
        Integer i = converter.toInt('2');
        assertEquals(2, i);
        assertEquals(Integer.class, i.getClass());
    }

    @Test
    void FloatToInt() {
        Integer i = converter.toInt(12.923142F);
        assertEquals(12, i);
        assertEquals(Integer.class, i.getClass());
    }

    @Test
    void DoubleToInt() {
        Double a = 12.999D;
        Integer i = converter.toInt(a);
        assertEquals(12, i);
        assertEquals(Integer.class, i.getClass());
    }


    // Exception
    @Test
    void numberFormatExTest() {
        Assertions.assertThrows(NumberFormatException.class, () -> converter.toInt("hello"));
    }

    // Exception
    @Test
    void numberFormatExTest2() {
        User user = new User("name", "age");
        Assertions.assertThrows(NumberFormatException.class, () -> converter.toInt(user));
    }

    class User {
        String name;
        String age;

        public User(String name, String age) {
            this.name = name;
            this.age = age;
        }
    }

    @Test
    void overflowTest() {
        assertThrows(NumberOverflowException.class, () -> converter.toInt(2147483647213D));
    }
}
