package miprimerproyecto.f.herencia.herencia_jerarquica;

public class GatoComun extends Gato {
	
	//26

	public GatoComun(int patas, int ojos) {
		super(patas, ojos);
		// TODO Auto-generated constructor stub
	}

	public GatoComun() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Est�s viendo a un gato com�n europeo.\n" + super.toString();
	}

}
