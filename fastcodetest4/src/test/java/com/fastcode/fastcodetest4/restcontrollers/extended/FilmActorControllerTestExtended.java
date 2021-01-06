package com.fastcode.fastcodetest4.restcontrollers.extended;

import com.fastcode.fastcodetest4.restcontrollers.core.FilmActorControllerTest;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
				properties = "spring.profiles.active=test")
public class FilmActorControllerTestExtended extends FilmActorControllerTest {
	
	//Add your custom code here	
}
