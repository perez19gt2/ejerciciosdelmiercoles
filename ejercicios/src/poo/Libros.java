package poo;

public class Libros {

	public static void main(String[] args) {
		
		libro libro1 = new libro ("9780060834838", "El alquimista", "Paulo Coelho", 197);
		libro libro2 = new libro ("8423973336", "La divina comedia", "Dante Alighieri", 536);
		
		System.out.println("El libro numero uno es: ");
		libro1.mostrar();
		System.out.println("El libro numero dos es: ");
		libro2.mostrar();
		System.out.println("---------------------------------------");
		
		if(libro1.mostrarPaginas() > libro2.mostrarPaginas()) {
			System.out.println( libro1.mostrarTitulo()+" tiene mas paginas que: " + libro2.mostrarTitulo());
		}else if(libro1.mostrarPaginas() == libro2.mostrarPaginas()){
			System.out.println( libro2.mostrarTitulo()+" tiene la misma cantidad de paginas que: " + libro1.mostrarTitulo());
		}else {
			System.out.println( libro2.mostrarTitulo()+" tiene mas paginas que: " + libro1.mostrarTitulo());
		}

		
		
	}
	
}
