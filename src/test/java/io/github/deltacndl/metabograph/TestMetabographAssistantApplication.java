package io.github.deltacndl.metabograph;

import org.springframework.boot.SpringApplication;

import io.github.deltacndl.metabograph.MetabographAssistantApplication;

public class TestMetabographAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.from(MetabographAssistantApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
