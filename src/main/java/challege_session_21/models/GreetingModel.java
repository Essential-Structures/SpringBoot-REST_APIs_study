package challege_session_21.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class GreetingModel {

    String greetTemplate =
            "Model:greet message template,custom message now follows:  ";
}
