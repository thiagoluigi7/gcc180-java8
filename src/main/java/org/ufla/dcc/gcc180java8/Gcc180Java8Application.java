package org.ufla.dcc.gcc180java8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Gcc180Java8Application {

	public static void main(String[] args) {
		SpringApplication.run(Gcc180Java8Application.class, args);
	}

}
