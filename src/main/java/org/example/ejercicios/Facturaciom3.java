package org.example.ejercicios;

import java.util.List;



public class Facturaciom3 {
	record Factura(String cliente, String fechafactura, List<Double> precioProducto) {
		double total() {
			return precioProducto.stream().mapToDouble(Double::doubleValue).sum();
		}
	}

	public static void main(String[] args) {
		Factura factura1 = new Factura("Maria Sanabria", "Julio 1, 1999", List.of(4500D, 5000D, 2500D));
		Factura factura2 = new Factura("Juan Perez", "Agosto 15, 2000", List.of(3500.0, 6000D, 2800D));

		System.out.println("Factura 1" );
		System.out.println("Cliente: " + factura1.cliente());
		System.out.println("Total: " + factura1.total());

		System.out.println("Factura 2" );
		System.out.println("Cliente: " + factura2.cliente());
		System.out.println("Total: " + factura2.total());
	}
}