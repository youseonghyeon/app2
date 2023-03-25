package converter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class EasyConverterAutoConfig {

    @Bean
    public EasyConverter easyConverter() {
        return new EasyConverter();
    }
}
