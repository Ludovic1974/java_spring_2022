package miprimerproyecto;

public class EjemploSplit {

	public EjemploSplit() {
		String string = "123-654321";
		String[] parts = string.split("-");
		String part1 = parts[0]; // 123
		String part2 = parts[1]; // 654321

	}

	public static void main(String[] args) {
		new EjemploSplit();

	}

}
