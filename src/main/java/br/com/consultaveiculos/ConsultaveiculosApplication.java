package br.com.consultaveiculos;

import br.com.consultaveiculos.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsultaveiculosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsultaveiculosApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();

		principal.exibeMenu();

	}
}

