package springboot.slf4j;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application {

	@Autowired
	static SampleSlf4j sampleSlf4j;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		sampleSlf4j.print("Hello");
	}

}
