package challege_session_21.controllers;

import challege_session_21.services.GreetingServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetControler {

    @Autowired
    private GreetingServiceable greetingService;


    @GetMapping("/greet/{name}")
    public ResponseEntity<String> personalGreet(@PathVariable String name) {

        return ResponseEntity.ok(
                greetingService.getGreeting(name));

    }
}
