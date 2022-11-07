package anotherOne.clases;

public class motos {
	
	private String marca;
	private Motor motor;

	
	
	public motos() {
		
	}

	public motos(Motor motor, String marca) {
		super();
		this.motor = motor;
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "motos [motor=" + motor + ", marca=" + marca + "]";
	}
	
	

	
	
	
}
