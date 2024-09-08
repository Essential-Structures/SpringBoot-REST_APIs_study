package challege_session_21;

import challege_session_21.models.GreetingModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("challenge_session_21")
public class AppConfig {

    @Bean
    GreetingModel greetingTemplate(){
        return new GreetingModel();
    }
}
