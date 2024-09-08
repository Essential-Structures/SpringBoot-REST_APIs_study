package challege_session_21;

import challege_session_21.models.GreetingModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("challenge_session_21")//where to scan for Components
public class AppConfig {

    @Bean
    GreetingModel greetingTemplate(){ //name of bean to be sed by ApplicationContext
        return new GreetingModel();
    }
}
