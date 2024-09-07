package com.ITSchool.REST_APIs_study;

import com.ITSchool.REST_APIs_study.services.ApplicationContextStudyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestAPIsStudyAppAKAMainClass {

    public static void main(String[] args) {
        SpringApplication.run(RestAPIsStudyAppAKAMainClass.class, args);
    }

    @Bean
    public ApplicationContextStudyService greetingServiceBean() {
        return new ApplicationContextStudyService("Mesaj pasat in constructor");
    }
}
