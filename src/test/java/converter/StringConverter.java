package converter;

import org.junit.jupiter.api.Test;

public class StringConverter {

    EasyConverter converter = new EasyConverter();

    @Test
    void objectToString(){
        converter.toString(new User("name", "age"));
    }

    class User {
        String name;
        String age;

        public User(String name, String age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }
}
