package Estructuras;

public class Main {

	private Node raiz;

	public class Node {

		String nombre;
		// referencia
		Node siguiente;

	}

	public Main() {

		raiz = null;
	}

	public void insert(String M) {

		Node nuevo = new Node();

		nuevo.nombre = M;

		if (raiz == null) {

			nuevo.siguiente = null;
			raiz = nuevo;

		} else {

			nuevo.siguiente = raiz;
			raiz = nuevo;

		}

	}

	// eleminar nodo
	public void extraer() {

		
		if (raiz != null) {
			
			String eliminar = raiz.nombre;
			System.out.println("La info a eliminar es: " + eliminar);
			raiz = raiz.siguiente;

		} else {

			System.out.println("No hay elementos en la pila");
		}

	}

	public void mostrar() {

		Node mostrar_info = raiz;
		int x = 0;

		while (mostrar_info != null) {

			System.out.println("La info del nodo " + x + " es: " + mostrar_info.nombre);
			x++;
			mostrar_info = mostrar_info.siguiente;
		}
	}
	// nodos existentes

	public void cantidad_nodos() {

		int x = 0;
		Node mover = raiz;

		while (mover != null) {
			x++;
			mover = mover.siguiente;

		}

		System.out.println("La cantidad de nodos existentes es: " + x);

	}

	// lista vacia
	public void lista_vacia() {

		if (raiz == null) {

			System.out.println("La lista esta vacia");
		} else {

			System.out.println("Hay elementos en la lista");
		}
	}

	public static void main(String[] args) {

	Main pila = new Main();
	
	
	pila.insert("Jairo Lopez, Sistemas");
	pila.insert("Maggy, derecho");
	pila.extraer();
	pila.mostrar();
	pila.lista_vacia();
	pila.cantidad_nodos();
	
	
	pila.mostrar();
	pila.lista_vacia();
	pila.cantidad_nodos();
	
	
	}

}
