package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Biblioteca {

	private Integer key = 1; // a medida que se va insertando datos se va generando el key
	public TreeMap<Integer, Libro> libros = new TreeMap<>(); // se guarda algo con una referencia (ID) seria la clave
																// para buscar ese libro. HashMap no permite duplicados,
																// Tree los ordena

	public Biblioteca() {

	}

	public void agregarLibro(Libro libro) {
		this.libros.put(key, libro);
		key++;
	}

	public Libro buscarLibroPorID(Integer key) {
		return this.libros.get(key);
	}

	public TreeMap<Integer, Libro> ordenarLibros(TreeMap<Integer, Libro> libros) {
		return libros;
	}

	protected Integer getKey() {
		return key;
	}

	protected void setKey(Integer key) {
		this.key = key;
	}

	protected TreeMap<Integer, Libro> getLibros() {
		return libros;
	}

	protected void setLibros(TreeMap<Integer, Libro> libros) {
		this.libros = libros;
	}

	public Integer getCantidadLibros() {

		return libros.size();
	}

	public Libro getLibro(Integer k) {
		return libros.get(k);
	}

	public Object contarPorGenero(Genero tipo) {
		Integer contador = 0;

		for (Entry<Integer, Libro> entry : libros.entrySet()) {
			Integer key = entry.getKey();
			Libro val = entry.getValue();
			if (val.getGenero() == tipo) {
				contador++;
			}
		}
		return contador;
	}

	public TreeSet<Libro> ordenarPorTamanio() {
		TreeSet<Libro> librosOrdenados = new TreeSet<Libro>(new ordenadosPorTamanioComparator());

		for (Map.Entry<Integer, Libro> entry : libros.entrySet()) {
			Libro val = entry.getValue();
			librosOrdenados.add(val);
		}

		return librosOrdenados;

	}

	public void mostrarLibrosOrdenados() {
		for (Entry<Integer, Libro> entry : libros.entrySet()) {
			Integer key = entry.getKey();
			Libro val = entry.getValue();
			System.out.println("Clave: " + key + ", Valor: " + val);
		}
	}

	public TreeSet<Libro> ordenarPorApellido() {
		TreeSet<Libro> librosOrdenadosPorAutor = new TreeSet<Libro>(new ordenadosPorAutorComparator());

		for (Map.Entry<Integer, Libro> entry : libros.entrySet()) {
			Libro val = entry.getValue();
			librosOrdenadosPorAutor.add(val);
		}
		return librosOrdenadosPorAutor;
	}

	public TreeSet<Libro> ordenarPorFecha() {
		TreeSet<Libro> librosOrdenadosPorApellido = new TreeSet<Libro>(new ordenadosPorFechaComparator());

		for (Map.Entry<Integer, Libro> entry : libros.entrySet()) {
			Libro val = entry.getValue();
			librosOrdenadosPorApellido.add(val);
		}
		return librosOrdenadosPorApellido;
	}

	public  Map<Integer,Integer>  ordenarPorTamanio2(List<Libro> libros) {
		Map<Integer,Integer> librosPorPaginas = new TreeMap<Integer, Integer>();
		for (Libro libro : libros) {
			Integer k = libro.getCantidadPaginas();
			if(librosPorPaginas.containsKey(k)) {
				Integer v = librosPorPaginas.get(k) + 1;
				librosPorPaginas.put(k, v);
				}
			else{
				librosPorPaginas.put(k, 1);
				}
			}
		return librosPorPaginas;

	}

}
