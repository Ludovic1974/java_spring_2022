package miprimerproyecto.f.interfaces.parte1;

public class Internet implements InterfazInternet {
	
	@Override
	public String tieneInternet(boolean opcion) {
		if(opcion) {
			return "Este aparato tiene internet";
		}
		return "No tiene internet"; 
	}

}
