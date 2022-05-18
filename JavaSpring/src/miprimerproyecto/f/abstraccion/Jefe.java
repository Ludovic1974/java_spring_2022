package miprimerproyecto.f.abstraccion;

public class Jefe extends Empleado {
	
	private double incentivo; 

	public Jefe(String nombre, double sueldo, String seccion) {
		super(nombre, sueldo, seccion);
		// TODO Auto-generated constructor stub
	}	

	@Override
	public String toString() {
		return super.toString() + "Jefe [getIncentivo()=" + getIncentivo() + "]";
	}



	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	

}
