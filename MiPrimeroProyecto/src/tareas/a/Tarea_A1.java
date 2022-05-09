package tareas.a;

public class Tarea_A1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean casado = true;
		final int MAXIMO = 99999;
		byte diasem = 1;	
		short dianual = 300;
		long miliseg = 1298332800000L;
		float totalfactura = 10350.678000F;
		long poblacion = 6775235741l;
		
		System.out.println(casado);
		System.out.println("Voy a concatenar este valor " + MAXIMO + " este valor");
		System.out.println(diasem);
		System.out.println(dianual);
		System.out.println(miliseg);
		System.out.println(totalfactura);
		System.out.println(poblacion);
		
		System.out.printf("cadena de texto %b otra cadena de texto %d %d %n",casado, MAXIMO, diasem);
		System.out.printf("%b%n",casado);
		System.out.printf("%d%n", MAXIMO);
		System.out.printf("%d%n",diasem);
		System.out.printf("%d%n",dianual);
		System.out.printf("%d%n",miliseg);
		System.out.printf("%.2f%n",totalfactura);
		System.out.printf("%d%n",poblacion);
		
		System.out.print("\n" + casado);
		System.out.print("\n" + MAXIMO);
		System.out.print("\n" + diasem);
		System.out.print("\n" + dianual);
		System.out.print("\n" + miliseg);
		System.out.print("\n" + totalfactura);
		System.out.print("\n" + poblacion);
		
		
	
	
	}
	
 
	
	
	
	
}
