package miprimerproyecto.f.abstraccion;
//6
public class Arquero extends Hero {

	public Arquero(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "es muy �gil! Es rubio y de pelo largo.\n";
	}

	@Override
	public String getHabilidades() {
		// TODO Auto-generated method stub
		return "Sabe luchar. Pero su gran especialidad es el tiro al arco.\nEs todav�a m�s veloz que el b�rbaro.\n";
	}

	@Override
	public String getDebilidades() {
		// TODO Auto-generated method stub
		return "Tiene miedo a encontrarse sin flechas. Siempre recogiendo las que tira por all�!\n";
	}
	
	@Override
	public String toString() {
		return getNombre() + " " 
	+ getDescripcion() 
	+ getHabilidades() 
	+ getDebilidades();
	}

}
