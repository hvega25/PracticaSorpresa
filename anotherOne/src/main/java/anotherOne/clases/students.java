package anotherOne.clases;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class students {

	private String first_name;
	private String last_name;
	LocalDate birthDate;
	boolean wantsNewSletter;
	
	
	public students() {
		
	}
	
	public students(String first_name, String last_name, LocalDate birthDate, boolean wantsNewSletter) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.birthDate = birthDate;
		this.wantsNewSletter = wantsNewSletter;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isWantsNewSletter() {
		return wantsNewSletter;
	}
	public void setWantsNewSletter(boolean wantsNewSletter) {
		this.wantsNewSletter = wantsNewSletter;
	}
	@Override
	public String toString() {
		return "students [first_name=" + first_name + ", last_name=" + last_name + ", birthDate=" + birthDate
				+ ", wantsNewSletter=" + wantsNewSletter + "]";
	}
	
	
}
