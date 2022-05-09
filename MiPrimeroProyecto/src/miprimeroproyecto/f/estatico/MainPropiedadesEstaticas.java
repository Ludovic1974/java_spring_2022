package miprimeroproyecto.f.estatico;

import java.util.ArrayList;
import java.util.Arrays;

public class MainPropiedadesEstaticas {

	public static void main(String[] args) {
		//1 a 10 -> Empleado
		//13		
		Empleado hector = new Empleado("H�ctor Suarez", "Inform�tica"); 
		Empleado maria = new Empleado("Mar�a Martinez", "Inform�tica"); 
		Empleado victoria = new Empleado("Victoria Hern�ndez", "Inform�tica");
		//14 lo pongo todo en un arraylist
		ArrayList<Empleado> empleados = new ArrayList<Empleado>(Arrays.asList(hector, maria, victoria));
		//15 un for para leerlos
//		for(Empleado e : empleados) {
//			System.out.println(e);
//		}
		//16 Pero qu� pasa si en la ejecuci�n del programa, meto un id repetido?
		Empleado ignacio = new Empleado("Ignacio Gonzalez", "Inform�tica");
		empleados.add(ignacio);
		//comentar� el 15
//		for(Empleado e : empleados) {
//			System.out.println(e);
//		}
		//17 nos encontramos con dos IDs similares. 
		//y eso nos puede dar problemas sobre todo con bases de datos
		//la soluci�n es hacer que id sea est�tico. 
		//le llamamos est�tico pero al final se vuelve din�mico ;-)
		
		//Ahora podemos hacer que el campo id se actualize solo 
		
		//22 ahora sin haber retocado nada aqu�, me encuentro con 
		//el id din�mico funcional. Si ejecuto funciona...
		//23
		// eso que tendr�a que quitar el id del constructor
		//lo hago
		
		//24Si a�ado un objeto empleado con el otro constructor tambi�n
		Empleado miguelAngel = new Empleado();
		empleados.add(miguelAngel);
		//25 comentar� el bucle del 16
		for(Empleado e : empleados) {
			System.out.println(e);
		}
		
		//27 
		//El siguiente empleado tendr� la id 
		System.out.println("El siguiente empleado tendr� la id n�" + Empleado.getIdClase());
		//28
		//modificando la propiedad con el setter
		Empleado.setIdClase(10);
		Empleado marcelo = new Empleado();
		empleados.add(marcelo);
		//29 comentar� los dem�s bucles
		for(Empleado e : empleados) {
			System.out.println(e);
		}

	}

}
