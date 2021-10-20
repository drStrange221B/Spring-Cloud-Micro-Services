package com.emrys.springcloud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(
		webEnvironment = RANDOM_PORT,
		properties = {"spring.cloud.config.enabled=false"}
)
class SpringcloudApplicationTests {

	@Test
	void contextLoads() {
	}

}
