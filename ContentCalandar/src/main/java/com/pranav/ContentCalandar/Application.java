package com.pranav.ContentCalandar;

import com.pranav.ContentCalandar.model.Content;
import com.pranav.ContentCalandar.model.Status;
import com.pranav.ContentCalandar.model.Type;
import com.pranav.ContentCalandar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}
