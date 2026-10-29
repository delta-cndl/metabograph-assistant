package io.github.deltacndl.metabograph_assistant;

import org.springframework.boot.SpringApplication;

public class TestMetabographAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.from(MetabographAssistantApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
