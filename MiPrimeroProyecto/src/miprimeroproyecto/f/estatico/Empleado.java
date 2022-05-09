package miprimeroproyecto.f.estatico;

public class Empleado {

	// 1 creamos un empleado con nombre_apellido y seccion
	// tengo comentado todos puntos que van a partir del 17
	private String seccion;
	private String nombre_apellido;
	// 6 a�adimos un campo id normal.
	// En teor�a es una propiedad de los objetos de la clase Empleado
//	private int id; 

	// 18 comento el 6, el 9 y el id del constructor
	// porque ya no vamos a poder utilizarlos as�
	// a�ado static al id
	private int idObjeto;
	private static int idClase = 1;

	// 2 el contructor por defecto
	public Empleado() {
		this.nombre_apellido = "Miguel �ngel Marcelo";
		this.seccion = "Seguridad";
		// 7 actualizo la id aqu�
		// this.id = 1;
		//19 uso del id est�tico
		this.idObjeto = idClase;
		idClase++;
	}

	// 3 el constructor con par�metros:
	public Empleado(String nombre_apellido, String seccion) {
		this.nombre_apellido = nombre_apellido;
		this.seccion = seccion;
		// 8 y aqu�
		// this.id = id;
		// 20 uso del id est�tico
		this.idObjeto = idClase;
		idClase++;
	}

	// 21 a�ado los getters y setters y actualizo el toString
	public int getIdObjeto() {
		return idObjeto;
	}

	public void setIdObjeto(int idObjeto) {
		this.idObjeto = idObjeto;
	}

	// 5 m�todo getDatos toString
	@Override
	public String toString() {
		// 10 y tambi�n aqu�
		return "El empleado con id " + getIdObjeto() + " de la secci�n " + getSeccion() + " se llama "
				+ getNombre_apellido() + "\n";
	}
	// 9
	// a�ado el getter setter del id
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	// 4 GETTERS y SETTERS
	public String getNombre_apellido() {
		return nombre_apellido;
	}

	public void setNombre_apellido(String nombre_apellido) {
		this.nombre_apellido = nombre_apellido;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	//26 creo ahora el getter setter de idClase
	//el sistema me hace m�todos est�ticos 
	//El getter me va a devolver 
	//seg�n parece el id de la pr�xima instancia de este misma clase
	//El setter me dar�a la posibilidad de modificar este valor
	public static int getIdClase() {
		return idClase;
	}

	public static void setIdClase(int idClase) {
		Empleado.idClase = idClase;
	}
	
	
	
	

}
