package ar.edu.unlam.pb2;

import java.util.Objects;

public class Libro implements Comparable<Libro>{
	
	private String titulo;
	private String apellidoAutor;
	private Integer cantidadPaginas;
	private String fechaPublicacion;
	private Genero genero;
	
	
	public Libro () {
		
	}
	
public Libro (String titulo, String apellidoAutor) {
	this.titulo = titulo;
	this.apellidoAutor = apellidoAutor;
	}


	public Libro(String titulo, String apellidoAutor, Integer cantidadPaginas, String fechaPublicacion, Genero genero) {
		super();
		this.titulo = titulo;
		this.apellidoAutor = apellidoAutor;
		this.cantidadPaginas = cantidadPaginas;
		this.fechaPublicacion = fechaPublicacion;
		this.genero = genero;
	}





	protected String getTitulo() {
		return titulo;
	}





	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}





	protected String getApellidoAutor() {
		return apellidoAutor;
	}





	protected void setApellidoAutor(String apellidoAutor) {
		this.apellidoAutor = apellidoAutor;
	}





	protected Integer getCantidadPaginas() {
		return cantidadPaginas;
	}





	protected void setCantidadPaginas(Integer cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}





	protected String getFechaPublicacion() {
		return fechaPublicacion;
	}





	protected void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}





	protected Genero getGenero() {
		return genero;
	}





	protected void setGenero(Genero genero) {
		this.genero = genero;
	}



	@Override
	public int compareTo(Libro o) {
		// TODO Auto-generated method stub
		return this.cantidadPaginas.compareTo(o.cantidadPaginas);
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidoAutor, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(apellidoAutor, other.apellidoAutor) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", apellidoAutor=" + apellidoAutor + ", cantidadPaginas=" + cantidadPaginas
				+ ", fechaPublicacion=" + fechaPublicacion + ", genero=" + genero + "]";
	}



	
	
}
