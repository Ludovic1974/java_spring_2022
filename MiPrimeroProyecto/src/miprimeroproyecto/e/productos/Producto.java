package miprimeroproyecto.e.productos;

public class Producto {

	// 1
	public int id;
	public String nombre;
	public double precio;

	// 2
	public Producto() {
		// Instanciar una clase
		id = 20;
		nombre = "Caja de Chocolate";
		precio = 2.54;
	}

	// 3
	public Producto(int id, String nombre, double precio) {
		// Ejemplar es cas� lo mismo que instanciar
		// La diferencia ser�a que no estamos dando un valor por defecto
		// No podemos usar las variables id, nombre y precio sin
		// referirnos a this. O el sistema no podr� asignar los valores
		// a las variables de la clase
		// id = id;
		// nombre = nombre;
		// precio = precio;
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	// 7
	// Cuando hablamos de Polimorfismo, nos referimos al hecho
	// de que podemos sobrecargar los constructores de una clase
	// para poder asignar distintas formas a los objetos
	// Los m�todos Producto() y Producto(int id, String nombre, double precio)
	// son un ejemplo de polimosphismo aplicada
	// Podriamos crear m�s formas de producto:
	public Producto(int id, double precio) {
		// Instanciar una clase
		this.id = id;
		nombre = "Caja de Chocolate" + id;
		this.precio = precio;
	}

	//11
	// DEFINIR EL COMPORTAMIENTO DE UNA CLASE ES
	// CREAR UN M�TODO QUE LE HAGA HACER ALGO
	public boolean determinarCalidad(String criterio) {

		if (nombre.contains(criterio)) {
			return true;
		}
		return false;
	}

}
