package Estructuras;

import javax.swing.JOptionPane;

public class Universidades {

	private Node raiz;

	public class Node {

		String nombre, direccion, carrera;
		Node siguiente;

	}

	public Universidades() {

		raiz = null;

	}

	public void insertar_nombre(String M, String N, String E) {

		Node nuevo = new Node();
		nuevo.nombre = M;
		nuevo.direccion = N;
		nuevo.carrera = E;

		if (raiz == null) {

			raiz = nuevo;

		} else {

			nuevo.siguiente = raiz;
			raiz = nuevo;

		}

	}

	public void extraer() {

		if (raiz != null) {

			String a = raiz.nombre;
			String b = raiz.direccion;
			String c = raiz.carrera;
			JOptionPane.showMessageDialog(null, "La info a elminar es: " + a + "\n-->" + b + "\n-->" + c);
			raiz = raiz.siguiente;

		} else {

			JOptionPane.showMessageDialog(null, "No hay elementos en la pila...");

		}

	}

	public void mostrar() {

		Node informacion = raiz;
		int x = 0;

		while (informacion != null) {

			JOptionPane.showMessageDialog(null, "La informacion que contiene el nodo " + x + " es: "
					+ informacion.nombre + "\n" + informacion.direccion + "\n" + informacion.carrera);

			x++;
			informacion = informacion.siguiente;
		}

	}

	public void lista_vacia() {

		if (raiz == null) {

			JOptionPane.showMessageDialog(null, "No hay elementos en la lista");

		} else {

			JOptionPane.showMessageDialog(null, "Hay elementos en la lista");

		}

	}

	public void cantidad() {

		int x = 0;
		Node nodo = raiz;

		while (nodo != null) {

			x++;
			nodo = nodo.siguiente;

		}

		JOptionPane.showMessageDialog(null, "La cantidad de nodos es: " + x);

	}

	public static void main(String[] args) {

		Universidades unis = new Universidades();

		unis.insertar_nombre("Valentina", "Calle 3 # 24-15", "Derecho");
		unis.insertar_nombre("Jules", "Calle 80 #110-20", "Mercadeo");
		unis.insertar_nombre("Samantha", "Diagonal 2d # 35-33", "Diseño grafico");
		unis.mostrar();
		unis.lista_vacia();
		unis.cantidad();
		unis.extraer();

		unis.mostrar();
		unis.lista_vacia();
		unis.cantidad();
	}

}
