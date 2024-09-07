package com.ITSchool.REST_APIs_study;

import com.ITSchool.REST_APIs_study.services.ApplicationContextStudyService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class RestApIsStudyApplicationTests {

	@Test
	void contextLoads() {
		ApplicationContext context = new AnnotationConfigApplicationContext(RestAPIsStudyAppAKAMainClass.class);
		ApplicationContextStudyService greetingService = context.getBean(ApplicationContextStudyService.class);
	}

}
