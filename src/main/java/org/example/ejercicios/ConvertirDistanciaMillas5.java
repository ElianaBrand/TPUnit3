package org.example.ejercicios;

public class ConvertirDistanciaMillas5 {
	public static void main(String[] args) {
		DistanciaViaje viaje = new DistanciaViaje("Medellin", "Bogotá", 100.0);
		System.out.println("La distancia entre " + viaje.origen() + " y " + viaje.destino() + " es de " + viaje.distanciaMillas() + " millas.");
	}

	record DistanciaViaje(String origen, String destino, double distanciakilometros) {
		double distanciaMillas() {
			return distanciakilometros * 0.621371;
		}
	}
}