package miprimerproyecto.f.abstraccion;

public abstract class BisAbuelo {
	
	private String nombre; 
	
	public String getNombre() {
		return nombre; 
	}
	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	abstract public String daHerencia();
	
	
	
	

	public BisAbuelo() {
		// TODO Auto-generated constructor stub
	}

}
