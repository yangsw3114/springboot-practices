package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * @SpringBootApplication 메타 애노테이션
 * 
 * @SpringBootConfiguration(cf. @Configuration)
 * @ComponentScan
 * @EnableAutoConfiguration
 *
 */
@SpringBootApplication
public class MyApplication {	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {
		}	
	}
}