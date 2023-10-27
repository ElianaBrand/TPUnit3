package org.example.ejercicios;

public class CalculaPerimetroRectangulo3 {
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(2.0, 6.0);
		System.out.println("El perímetro del rectángulo es: " + rectangulo.perimetro());
	}

	record Rectangulo(double ancho, double largo) {
		double perimetro() {
			return 2 * (ancho + largo);
		}
	}
}
