package anotherOne.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import anotherOne.clases.students;



@RestController
@RequestMapping("basic")
public class studentsController {

	@Autowired
	@Qualifier("students")
	private students alumnos1;
	
	@GetMapping("saludos")
	public String saludos() {
		
		System.out.println(alumnos1);
		
		return "Buenas tardes";
	}
	@Autowired
	private students alumnos2;
	
	@GetMapping("saludos2")
	public String saludos2() {
		
		System.out.println(alumnos2);
		
		return "Buenas tades";
	}
	
}
