package miprimerproyecto.f.herencia.herencia_unica;

public class Siames extends Gato {
	/*
	 * 18
	 * EJEMPLO DE HERENCIA �NICA 
	 * */

	public Siames() {
		// TODO Auto-generated constructor stub
	}
	

	public Siames(int patas, int ojos) {
		super(patas, ojos);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Est�s viendo a un siam�s.\n" + super.toString();
	}
	
	

}
