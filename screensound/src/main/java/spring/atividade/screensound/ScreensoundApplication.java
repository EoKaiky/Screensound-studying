package spring.atividade.screensound;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.atividade.screensound.principal.Principal;
import spring.atividade.screensound.repository.ArtistRepository;

@SpringBootApplication
public class ScreensoundApplication implements CommandLineRunner {
	
	@Autowired
	private ArtistRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ScreensoundApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.exibeMenu();
	}
} 
