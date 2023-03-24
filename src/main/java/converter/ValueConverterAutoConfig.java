package converter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class ValueConverterAutoConfig {

    @Bean
    public ValueConverter typeConverter() {
        return new ValueConverter();
    }
}
