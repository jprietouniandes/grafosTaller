package main.java.ejemplo.grafoDirigido;

import java.util.List;

public class Ejemplo {

	public static void main(String[] args) {
		
		try {
			
			Grafo g = new Grafo();
			
			g.addNodo("A");
			g.addNodo("B");
			g.addNodo("C");
			
			g.addArco("A", "B", 0);
			g.addArco("B", "C", 0);
			g.addArco("A", "C", 0);

			List<Nodo> camino = g.buscarRuta("A", "C");
			
			if (camino == null) {
				System.out.println("Camino A -> C no encontrado");
			} else {
				System.out.println("Camino A -> C encontrado");
				for (Nodo nodo: camino) {
					System.out.println(nodo.getNombre());
				}				
			}
			System.out.println();
			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			
			Grafo g = new Grafo();
			
			g.addNodo("A");
			g.addNodo("B");
			g.addNodo("C");
			g.addNodo("D");
			g.addNodo("E");
			
			g.addArco("A", "B", 0);
			g.addArco("B", "C", 0);
			g.addArco("C", "D", 0);
			g.addArco("E", "D", 0);
			g.addArco("A", "C", 0);
			
			List<Nodo> camino = g.buscarRuta("A", "E");
			
			if (camino == null) {
				System.out.println("Camino A -> E no encontrado");
			} else {
				System.out.println("Camino A -> E encontrado");
				for (Nodo nodo: camino) {
					System.out.println(nodo.getNombre());
				}				
			}
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
