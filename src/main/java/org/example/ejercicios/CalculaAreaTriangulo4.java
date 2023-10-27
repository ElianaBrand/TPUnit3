package org.example.ejercicios;

public class CalculaAreaTriangulo4 {
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo("rojo", 5D, 6.0);
		System.out.println("Color del triángulo: " + triangulo.c());
		System.out.println("Altura del triángulo: " + triangulo.h());
		System.out.println("Base del triángulo: " + triangulo.b());
		System.out.println("Área del triángulo: " + triangulo.area());
	}

	record Triangulo(String c, double b, double h) {
		double area() {
			return 0.5 * b * h;
		}
	}
}
