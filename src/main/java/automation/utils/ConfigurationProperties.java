package automation.utils;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
@Getter @Setter
public class ConfigurationProperties {

    @Value("${browser}")
    private String browser;

    @Value("${numeroItem}")
    private String numeroItem;

}
