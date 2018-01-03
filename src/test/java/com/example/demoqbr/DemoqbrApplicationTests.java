package com.example.demoqbr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoqbrApplicationTests {

	//@Autowired
	//private TestRestTemplate template;

	@Test
	public void contextLoads() {
	//	HttpHeaders headers = template.getForEntity("/whoami", String.class).getHeaders();
	//	assertThat(headers.getLocation().toString(), containsString("192."));
	//	HttpHeaders headers = template.getForEntity("http://localhost" +
	//			";8081/whoami", String.class).getHeaders();
	//	assertThat(headers.getLocation().toString(), containsString("application is running "));

	}

}
