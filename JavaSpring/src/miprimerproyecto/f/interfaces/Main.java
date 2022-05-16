package miprimerproyecto.f.interfaces;

public class Main {

	public static void main(String[] args) {
		//8
		System.out.println("###################1####################");
		Telefono telefonoViejo = new Telefono(645789789, "Fernando");
		System.out.println(telefonoViejo);
		System.out.println(telefonoViejo.pasarLlamadas(689147258));
		System.out.println(telefonoViejo.tieneCalculadora(true));
		System.out.println(telefonoViejo.tieneInternet(false));
		System.out.println("###################2####################");
		Telefono telefonoNuevo = new Telefono(619123123, "Ludovic");
		System.out.println(telefonoNuevo);
		System.out.println(telefonoNuevo.pasarLlamadas(615789852));
		System.out.println(telefonoNuevo.tieneCalculadora(true));
		System.out.println(telefonoNuevo.tieneInternet(true));
		
	

	}

}
