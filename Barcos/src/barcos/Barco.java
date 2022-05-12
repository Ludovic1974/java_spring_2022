package barcos;

public class Barco {

	private String nombre;
	private int ancho;//cm
	private int longitud;//cm
	private byte plazas;
	private double potencia;
	private int altura;

	public Barco() {
		this.nombre = "Yellow submarine";
		this.ancho = 600;//6m
		this.longitud = 1200;
		this.plazas = 4;
		this.potencia = 1800;
		this.altura = 500;//5m
	}

	public Barco(String nombre, int ancho, int longitud, 
			byte plazas, double potencia, int altura) {
		this.nombre = nombre;
		this.ancho = ancho;
		this.longitud = longitud;
		this.plazas = plazas;
		this.potencia = potencia;
		this.altura = altura;
	}

	public Barco(int ancho, int longitud, int altura) {
		this.nombre = "Titanic";	
		this.plazas = 2;
		this.potencia = 1800;		
		this.ancho = ancho;
		this.longitud = longitud;
		this.altura = altura;
	}
	
	public String obtenerDatos() {
		return "Mi barco se llama " + this.getNombre() 
		+ " y su potencia es de " + this.getPotencia() 
		+ " caballos.\n"; 			
	}
	
	public boolean alturaInferiorA(int alturaPuente) {
		if(this.altura < alturaPuente) {
			return true;
		}
		return false; 
	}
	
	public boolean anchoInferiorA(int anchoPuente) {
		if(this.ancho < anchoPuente) {
			return true;
		}
		return false; 
	}
	
	

	@Override
	public String toString() {
		return "Mi barco se llama " + this.getNombre() 
		+ " y su potencia es de " + this.getPotencia() 
		+ " caballos.\n"; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public byte getPlazas() {
		return plazas;
	}

	public void setPlazas(byte plazas) {
		this.plazas = plazas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	

	
	


	
	
	
	

}
