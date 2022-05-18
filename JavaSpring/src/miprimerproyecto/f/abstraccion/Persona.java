package miprimerproyecto.f.abstraccion;

public abstract class Persona {
	
	private String nombre; 

	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	@Override
	public String toString() {
		return "Persona [getNombre()=" + getNombre() + ", getDescripcion()=" + getDescripcion() + "]";
	}



	public String getNombre() {
		return nombre; 
	}
	
	abstract public String getDescripcion();

}
