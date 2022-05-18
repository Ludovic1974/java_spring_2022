package miprimerproyecto.f.interfaces.parte1;

public class Main {

	public static void main(String[] args) {
	
		
		
		System.out.println("****************HERENCIA M�LTIPLE****************************");
		/* 	//8
		 * Herencia M�ltiple (a trav�s de interfaces): en Herencia m�ltiple, una clase
		 * puede tener m�s de una superclase y heredar caracter�sticas de todas las
		 * clases principales. Tenga en cuenta que Java no admite herencia m�ltiple con
		 * clases. En Java, podemos lograr herencia m�ltiple solo a trav�s de
		 * Interfaces. 
		 */
		
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
