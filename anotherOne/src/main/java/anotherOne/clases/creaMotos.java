package anotherOne.clases;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;




@Component
public class creaMotos {

	@Bean
	public motos yamaha() {
		System.out.println("yamaha creado");
		return new motos(new Motor(), "yamaha");
	}
	@Bean
	@Primary
	public motos bmw() {
		System.out.println("Audi creat");
		return new motos(new Motor(), "bmw");
	}	
	
}

