package listasEnlazadas.taller;

public class Ej_02_ListaPalabrasMasVocales {
	
	public static Lista obtenerListaPalabrasMas2Vocales(Lista palabras) {
		Lista listaPalabras = new Lista();
		Nodo aux = palabras.getNodoPrimero();
		
		while(aux != null) {
			int numVocales = contarVocalesPalabra(aux.getCadenaNodo());
			if(numVocales > 2) 
				listaPalabras.agregarAlFinal(aux.getCadenaNodo());
			
			aux = aux.getSiguienteNodo();
		}
		return listaPalabras;
	}

	private static int contarVocalesPalabra(String palabra) {
		int contador = 0;
		
		for(int x=0;x<palabra.length();x++) {
			 if ((palabra.charAt(x)=='a') || (palabra.charAt(x)=='á') || (palabra.charAt(x)=='e')|| (palabra.charAt(x)=='é') || 
				 (palabra.charAt(x)=='i') || (palabra.charAt(x)=='í') || (palabra.charAt(x)=='o') || (palabra.charAt(x)=='ó') || 
				 (palabra.charAt(x)=='u') || (palabra.charAt(x)=='ú')){ 
			    contador++;
			  }
			}
		return contador;
	}

	public static void main(String[] args) {
		Lista lista = new Lista();
		Lista listaPalabras = new Lista();
		
		lista.agregarNodo("manzna");
		lista.agregarNodo("lapiz");
		lista.agregarNodo("computador");
		lista.agregarNodo("universidad");
		lista.agregarNodo("oficina");
		lista.imprimirLista();
		
		System.out.println("\n");
		System.out.println("Lista Impares");
		
		listaPalabras = obtenerListaPalabrasMas2Vocales(lista);
		listaPalabras.imprimirLista();

	}

}
