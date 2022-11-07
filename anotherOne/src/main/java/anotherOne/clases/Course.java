package anotherOne.clases;

import javax.persistence.OneToOne;

public class Course {
	
	@OneToOne
	private Course course;
	
}
