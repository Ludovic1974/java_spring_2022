package miprimeroproyecto.c;

public class Funciones {
	
	public Funciones() {
		edad = 20; 
	}
	
	public int edad; 
	


	public void devuelveNada() {

		System.out.println("Ser�a decir una mentira "
				+ "afirmar que este m�todo no "
				+ "devuelve nada ???");
	}

	public String devuelveUnTexto() {
		return "Devuelve algo este m�todo?";
	}

	public double calculaMediaEdad() {
		int edadPersona1, edadPersona2, numPersonas; // double
		double media;
		edadPersona1 = 21;
		edadPersona2 = 44;
		numPersonas = 2;
		media = (edadPersona1 + edadPersona2) / numPersonas;
		return media;
	}

	public double calculaMediaEdad(int edadPersona1, 
			int edadPersona2, int numPersonas) {
		double media;
		media = (double)(edadPersona1 + edadPersona2) / numPersonas;
		return media;
	}

	public String colorCoche(String color) {
		return "El color del coche es " + color;
	}

	public static String llamadaFuncionEstatica() {
		return "Esto es una funci�n est�tica";
	}

	public static String llamadaFuncionEstaticaConParam(String param) {
		return "Esto es una funci�n est�tica que devuelve adem�s "
				+ "el par�metro " + param;
	}

	public static void cambiar(int a, int[] b) {
		a = 50;
		b[0] = 60;
		b[1] = 70;
		System.out.println("Dentro: " + a + " " + b[0] + " " + b[1]);
	}
	
	public int incrementaVariable(int referencia) {
		referencia++;  
		System.out.println("Dentro del m�todo el valor de referencia es " + referencia);
		return referencia; 
	}
	
	public int incrementaVariableArray(int[] referencia) {
		referencia[0]++;  
		System.out.println("Con un array, el resultado es distinto. Ahora Referencia vale " + referencia[0]);
		return referencia[0]; 
	}



	public static void main(String[] args) {
		//
		//Parte 1
		//
		Funciones salida = new Funciones();
//		salida.devuelveNada();
//		salida.devuelveUnTexto();
//		// La funci�n se ha ejecutado con normalidad
//		// Devuelve un string pero no se contempla ya que no hemos pedido al sistema que
//		// lo imprima en pantalla.
//		System.out.println(salida.devuelveUnTexto());
//
//		// Para comprobarlo podemos crear funciones que vayan a realizar c�lculos
//		double resultado = salida.calculaMediaEdad();
//		System.out.println("1 - La media de edad de estas personas es: " + resultado);
		
		
		
		// Qu� observamos? Como lo podemos solucionar? Uso de Double para no perder

		//	Qu� sep�is que hemos utilizado Variables locales
		// edadPersona1, edadPersona2, numPersonas no valen nada fuera del m�todo
		//	Los hemos declarado dentro del m�todo y solo pueden emplearse 
		//	dentro del propio m�todo. Estas variables locales pueden ser de un tipo primitivo o de un tipo referencia. 
		//	Su existencia (reserva de espacio en memoria) s�lo dura mientras se est� ejecutando la llamada al m�todo.

		// Podemos utilizar par�metros en las funciones
//		System.out.println(salida.colorCoche("rojo"));
		
		// Tambi�n podemos sobrescribir funciones a condici�n de no repetir el n�mero de
		// par�metros
//		System.out.println("2 - La media de edad de estas personas es: " + salida.calculaMediaEdad(21, 44, 2));
		// Los par�metros dan a las funciones la posiblidad de ser m�s din�micas

		// Funciones est�ticas
		// Las funciones est�ticas se llaman directamente sin pasar por la instancia de
		// la clase Funciones en nuestro caso
//		System.out.println(llamadaFuncionEstatica());
//
//		System.out.println(llamadaFuncionEstaticaConParam("Cualquiera"));
		
		
		//
		//Parte 2 
		//
//		System.out.println();
//		System.out.println();
//		System.out.println();
		

		
		//Podemos intentar modificar un variable que hemos 
		//creado en la clase y que instanciamos dentro del m�todo
		//A ver qu� pasa? 
		int referencia = 12; //Es de tipo primitivo
//		salida.incrementaVariable(referencia);
//		System.out.println("fuera de la funci�n el valor de "
//				+ "referencia es " + referencia);
//		
//		salida.incrementaVariable(referencia);
//		System.out.println("Segundo uso: fuera de la funci�n el "
//				+ "valor de referencia sigue siendo " + referencia);
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		//Una soluci�n ser�a pisar el valor de la variable		
//		referencia = salida.incrementaVariable(referencia);
//		System.out.println("Despu�s de pisar el valor de referencia sale con el n�mero " + referencia);
//		referencia = salida.incrementaVariable(referencia);
//		System.out.println("Si repetimos, el valor de referencia sale con el n�mero " + referencia);
////		System.out.println();
////		System.out.println();
////		System.out.println();
//		
		//Si usamos un array, la cosa cambia		
		int[] referenciaArr = {12, 1}; 
		salida.incrementaVariableArray(referenciaArr);
		System.out.println("fuera de la funci�n el valor de la primera posici�n del array referencia es " + referenciaArr[0]);
		
		salida.incrementaVariableArray(referenciaArr);
		System.out.println("Segundo uso: el valor de la primera posici�n del array referencia es " + referenciaArr[0]);
		
		/*
		 * En Java todos los par�metros de los m�todos se pasan por valor. Cuando se
		 * realiza la llamada a un m�todo, los par�metros formales (par�metros indicados
		 * en la declaraci�n) reservan un espacio en memoria independiente y reciben los
		 * valores de los par�metros reales (par�metros indicados en la llamada al
		 * m�todo). �Qu� consecuencias tiene el paso por valor de los par�metros?
		 * 
		 * Cuando el argumento es de tipo primitivo, el paso por valor significa que
		 * durante la ejecuci�n del m�todo se reserva un nuevo espacio para el par�metro
		 * formal y no se puede modificar el par�metro real durante la ejecuci�n del
		 * m�todo. Cuando el argumento es de tipo referencia (por ejemplo, un array, un
		 * objeto,...) el paso por valor significa que no puede modificarse la
		 * referencia pero se pueden realizar llamadas a los m�todos del objeto y
		 * modificar el valor asignado a las variables miembro accesibles del objeto
		 * durante la ejecuci�n del m�todo.
		 * 
		 * Por ejemplo, en el siguiente programa el m�todo cambiar utiliza un par�metro
		 * de tipo primitivo (a, un valor num�rico entero) y un par�metro de tipo
		 * referencia (b, un array de valores enteros):
		 */
		
		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//		// Para el siguiente punto los alumnos tienen que saber manejar arrays y
//		// M�todos est�ticos
//		// Paso por valor y paso por referencia
//
//		int n;
//		int[] v = new int[2];
//		n = 10;
//		v[0] = 20;
//		v[1] = 30;
//
//		System.out.println("Antes:   " + n + " " + v[0] + " " + v[1]);
//		cambiar(n, v);
//		System.out.println("Despu�s: " + n + " " + v[0] + " " + v[1]);
//
//		System.out.println();
//		System.out.println();
//		System.out.println();

	}
}

