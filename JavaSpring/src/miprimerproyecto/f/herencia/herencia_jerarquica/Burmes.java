package miprimerproyecto.f.herencia.herencia_jerarquica;

public class Burmes extends Gato {
	
	//27

	public Burmes(int patas, int ojos) {
		super(patas, ojos);
		// TODO Auto-generated constructor stub
	}

	public Burmes() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Est�s viendo a un gato burm�s.\n" + super.toString();
	}

}
