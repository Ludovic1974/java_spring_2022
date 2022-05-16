package miprimerproyecto.f.interfaces;

public class Internet implements InterfazInternet {
	
	@Override
	public String tieneInternet(boolean opcion) {
		if(opcion) {
			return "Este aparato tiene internet";
		}
		return "No tiene internet"; 
	}

}
