package anotherOne.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import anotherOne.clases.motos;

@RestController
@RequestMapping("basic")
public class motosController {

	@Autowired
	@Qualifier("yamaha")
	private motos moto1;
	
	@GetMapping("saludos")
	public String saludos() {
		
		System.out.println(moto1);
		
		return "Buenas tardes";
	}
	@Autowired
	private motos moto2;
	
	@GetMapping("saludos2")
	public String saludos2() {
		
		System.out.println(moto2);
		
		return "Buenas tades";
	}
	
}
