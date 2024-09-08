package challege_session_21.services;

import challege_session_21.AppConfig;
import challege_session_21.models.GreetingModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

//Business logic
@Service
public class GreetingService implements GreetingServiceable{

    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    GreetingModel greet = context.getBean("greetingTemplate",GreetingModel.class);

    //@Autowired
    public String getGreeting(String customMessage){
        return (greet.getGreetTemplate() + customMessage);
    }
}
