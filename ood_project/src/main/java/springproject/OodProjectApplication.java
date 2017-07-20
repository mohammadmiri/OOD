package springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.MimeMappings;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class OodProjectApplication  {

	public static void main(String[] args) {
		SpringApplication.run(OodProjectApplication.class, args);
	}
}
