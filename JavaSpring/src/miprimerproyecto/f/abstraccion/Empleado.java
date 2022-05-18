package miprimerproyecto.f.abstraccion;

public class Empleado extends Persona {
	
	
	private double sueldo; 
	private String seccion; 


	public Empleado(String nombre, double sueldo, String seccion) {
		super(nombre);
		this.sueldo = sueldo;
		this.seccion = seccion;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [getSueldo()=" + getSueldo() 
		+ ", getSeccion()=" + getSeccion()+ "]";
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}	

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Es un empleado";
	}
	
	
	
	

}
