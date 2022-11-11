package poo;

public class libro {
	
	private String ISBN;
	private String Titulo;
	private String autor;
	private int paginas;
	public libro(String iSBN, String titulo, String autor, int paginas) {
		super();
		ISBN = iSBN;
		Titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	public void mostrar() {
		System.out.println("El libro " + Titulo + "con su ISBN " + ISBN + " crado por " + autor + " tiene " + paginas + " paginas.");
		
		
	}

	public String mostrarISBN() {
		return ISBN;
	}

	public void ponerISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String mostrarTitulo() {
		return Titulo;
	}

	public void ponerTitulo(String titulo) {
		Titulo = titulo;
	}

	public String mostrarAutor() {
		return autor;
	}

	public void ponerAutor(String autor) {
		this.autor = autor;
	}

	public int mostrarPaginas() {
		return paginas;
	}

	public void ponerPaginas(int paginas) {
		this.paginas = paginas;
	}
	

}
