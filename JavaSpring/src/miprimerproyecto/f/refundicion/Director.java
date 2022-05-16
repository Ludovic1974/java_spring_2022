package miprimerproyecto.f.refundicion;

final public class Director extends Jefe {

	// 10
	public Director(String nombre, double sueldo) {
		super(nombre, sueldo);
		// TODO Auto-generated constructor stub
	}

	private double bonificaciones;

	public double getBonificaciones() {
		return bonificaciones;
	}

	public void setBonificaciones(double bonificaciones) {
		this.bonificaciones = bonificaciones;
	}
	
	//11 pisar el método getSueldo
    @Override
    public double getSueldo(){            
        return super.getSueldo() + bonificaciones; 
    }

}
