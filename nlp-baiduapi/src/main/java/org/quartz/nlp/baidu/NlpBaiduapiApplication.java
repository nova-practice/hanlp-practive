package org.quartz.nlp.baidu;

import org.quartz.nlp.baidu.api.AuthService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NlpBaiduapiApplication {

	public static void main(String[] args) {

		//SpringApplication.run(NlpBaiduapiApplication.class, args);


		System.out.println(AuthService.getAuth());
	}
}
