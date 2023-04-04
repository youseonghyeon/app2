package converter;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ListConverterTest {

    EasyConverter converter = new EasyConverter();

    @Test
    void toListTest() {
        List<String> s = converter.toList("a", "b", "c");
        List<Integer> i = converter.toList(1, 2, 3);
        List<Unit> units = converter.toList(new Unit(), new Unit(), new Unit());
        List<Object> list = converter.toList(1, "2", new Unit());
    }

    public static class Unit {

    }
}
