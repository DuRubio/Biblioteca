package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class BibliotecaTest {

	
	@Test
	public void queSeAgregueLibro() {
		Biblioteca biblioteca = new Biblioteca ();
		Libro harry = new Libro ("Harry potter1", "Pepe");
		Libro harry2 = new Libro ("Harry potter2", "Pepe");
		Libro harry3 = new Libro ("Harry potter3", "Pepe");
		Libro harry4 = new Libro ("Harry potter4", "Pepe");
		Libro harry5 = new Libro ("Harry potter5", "Pepe");
		biblioteca.agregarLibro(harry);
		biblioteca.agregarLibro(harry2);
		biblioteca.agregarLibro(harry3);
		biblioteca.agregarLibro(harry4);
		biblioteca.agregarLibro(harry5);
		Assert.assertEquals(harry5, biblioteca.getLibros().get(5));
		
	}
	
	@Test
	public void queSePuedaComprarVariasVecesElMismo() {
		Biblioteca biblioteca = new Biblioteca ();
		Libro harry = new Libro ("Harry potter1", "Pepe");
		Libro harry2 = new Libro ("Harry potter1", "Pepe");
		Libro harry3 = new Libro ("Harry potter1", "Pepe");
		biblioteca.agregarLibro(harry);
		biblioteca.agregarLibro(harry2);
		biblioteca.agregarLibro(harry3);
		Integer ve=3;
		//System.out.println(biblioteca.getLibro(3));
		//System.out.println(biblioteca.getLibro(1));
		Assert.assertEquals(ve, biblioteca.getCantidadLibros());
	}
	
	@Test
	public void contarPorGenero() {
		Biblioteca biblioteca = new Biblioteca ();
		Libro harry1 = new Libro ("Harry potter1", "Pepe", 245, "2020", Genero.Ficcion);
		Libro harry2 = new Libro ("Harry potter2", "Pepe", 265, "2021", Genero.Ficcion);
		Libro conoCT = new Libro ("Conocete", "Stamateas", 124, "1998", Genero.AutoAyuda);
		Libro america = new Libro ("Informe America", "Pigna", 340, "1960", Genero.Divulgacion);
		Libro titanic = new Libro ("Titanic", "Brad", 145, "1980", Genero.Ficcion);
		Libro pensamientos = new Libro ("Pensamientos 1", "Stamateas", 245, "2022", Genero.AutoAyuda);
		Libro marte = new Libro ("El planeta Rojo", "Pigna", 120, "2012", Genero.Ficcion);
		Libro fin = new Libro ("El fin del mundo", "Pigna", 160, "2012", Genero.Ficcion);
		
		biblioteca.agregarLibro(harry1);
		biblioteca.agregarLibro(harry2);
		biblioteca.agregarLibro(conoCT);
		biblioteca.agregarLibro(america);
		biblioteca.agregarLibro(titanic);
		biblioteca.agregarLibro(pensamientos);
		biblioteca.agregarLibro(marte);
		biblioteca.agregarLibro(fin);
		
		Integer ve1= 5;
		Integer ve2=2;
		Integer ve3=1;
		
		Assert.assertEquals(ve1,biblioteca.contarPorGenero(Genero.Ficcion));
		Assert.assertEquals(ve2,biblioteca.contarPorGenero(Genero.AutoAyuda));
		Assert.assertEquals(ve3,biblioteca.contarPorGenero(Genero.Divulgacion));

	}
	
	@Test
	public void queSePuedanOrdenarPorTamanio() {
		Biblioteca biblioteca = new Biblioteca ();
		Libro harry1 = new Libro ("Harry potter1", "Pepe", 245, "2020", Genero.Ficcion);
		Libro harry2 = new Libro ("Harry potter2", "Pepe", 265, "2021", Genero.Ficcion);
		Libro conoCT = new Libro ("Conocete", "Stamateas", 124, "1998", Genero.AutoAyuda);
		Libro america = new Libro ("Informe America", "Pigna", 340, "1960", Genero.Divulgacion);
		Libro titanic = new Libro ("Titanic", "Brad", 145, "1980", Genero.Ficcion);
		Libro pensamientos = new Libro ("Pensamientos 1", "Stamateas", 245, "2022", Genero.AutoAyuda);
		Libro marte = new Libro ("El planeta Rojo", "Pigna", 120, "2012", Genero.Ficcion);
		Libro fin = new Libro ("El fin del mundo", "Pigna", 160, "2012", Genero.Ficcion);
		biblioteca.agregarLibro(harry1);
		biblioteca.agregarLibro(harry2);
		biblioteca.agregarLibro(conoCT);
		biblioteca.agregarLibro(america);
		biblioteca.agregarLibro(titanic);
		biblioteca.agregarLibro(pensamientos);
		biblioteca.agregarLibro(marte);
		biblioteca.agregarLibro(fin);
		
//		List <Libro> librosSinKey = new ArrayList<Libro>();
//		librosSinKey.add(harry1);
//		librosSinKey.add(harry2);
//		librosSinKey.add(conoCT);
//		librosSinKey.add(america);
//		librosSinKey.add(titanic);
//		librosSinKey.add(pensamientos);
//		librosSinKey.add(marte);
//		librosSinKey.add(fin);
//		//biblioteca.mostrarLibrosOrdenados();
		

		Assert.assertEquals(marte,biblioteca.ordenarPorTamanio().first());
	}
	
	@Test
	public void queSePuedanOrdenarPorTamanio2() { //hecho como explico el profe
		Biblioteca biblioteca = new Biblioteca ();
		Libro harry1 = new Libro ("Harry potter1", "Pepe", 245, "2020", Genero.Ficcion);
		Libro harry2 = new Libro ("Harry potter2", "Pepe", 265, "2021", Genero.Ficcion);
		Libro conoCT = new Libro ("Conocete", "Stamateas", 124, "1998", Genero.AutoAyuda);
		Libro america = new Libro ("Informe America", "Pigna", 340, "1960", Genero.Divulgacion);
		Libro titanic = new Libro ("Titanic", "Brad", 145, "1980", Genero.Ficcion);
		Libro pensamientos = new Libro ("Pensamientos 1", "Stamateas", 245, "2022", Genero.AutoAyuda);
		Libro marte = new Libro ("El planeta Rojo", "Pigna", 120, "2012", Genero.Ficcion);
		Libro fin = new Libro ("El fin del mundo", "Pigna", 160, "2012", Genero.Ficcion);
	
		
		List <Libro> librosSinKey = new ArrayList<Libro>();
		librosSinKey.add(harry1);
		librosSinKey.add(harry2);
		librosSinKey.add(conoCT);
		librosSinKey.add(america);
		librosSinKey.add(titanic);
		librosSinKey.add(pensamientos);
		librosSinKey.add(marte);
		librosSinKey.add(fin);
//		//biblioteca.mostrarLibrosOrdenados();
		
		Map<Integer, Integer> libritosPorPaginas = new HashMap<Integer, Integer>();
		libritosPorPaginas = biblioteca.ordenarPorTamanio2(librosSinKey);
		
		Integer ve = 1;
		Integer vo = libritosPorPaginas.get(120);

		Assert.assertEquals(ve, vo);
	}
	
	
	@Test 
	public void queSePuedanOrdenarPorApellidoDeAutor() {
		Biblioteca biblioteca = new Biblioteca ();
		Libro harry1 = new Libro ("Harry potter1", "Pepe", 245, "2020", Genero.Ficcion);
		Libro harry2 = new Libro ("Harry potter2", "Pepe", 265, "2021", Genero.Ficcion);
		Libro conoCT = new Libro ("Conocete", "Stamateas", 124, "1998", Genero.AutoAyuda);
		Libro america = new Libro ("Informe America", "Pigna", 340, "1960", Genero.Divulgacion);
		Libro titanic = new Libro ("Titanic", "Brad", 145, "1980", Genero.Ficcion);
		Libro pensamientos = new Libro ("Pensamientos 1", "Stamateas", 245, "2022", Genero.AutoAyuda);
		Libro marte = new Libro ("El planeta Rojo", "Pigna", 120, "2012", Genero.Ficcion);
		Libro fin = new Libro ("El fin del mundo", "Pigna", 160, "2012", Genero.Ficcion);
		biblioteca.agregarLibro(harry1);
		biblioteca.agregarLibro(harry2);
		biblioteca.agregarLibro(conoCT);
		biblioteca.agregarLibro(america);
		biblioteca.agregarLibro(titanic);
		biblioteca.agregarLibro(pensamientos);
		biblioteca.agregarLibro(marte);
		biblioteca.agregarLibro(fin);
				

		Assert.assertEquals(titanic,biblioteca.ordenarPorApellido().first());
	}
	
	@Test
	public void queSePuedanOrdenarPorFecha() {
		Biblioteca biblioteca = new Biblioteca ();
		Libro harry1 = new Libro ("Harry potter1", "Pepe", 245, "2020", Genero.Ficcion);
		Libro harry2 = new Libro ("Harry potter2", "Pepe", 265, "2021", Genero.Ficcion);
		Libro conoCT = new Libro ("Conocete", "Stamateas", 124, "1998", Genero.AutoAyuda);
		Libro america = new Libro ("Informe America", "Pigna", 340, "1960", Genero.Divulgacion);
		Libro titanic = new Libro ("Titanic", "Brad", 145, "1980", Genero.Ficcion);
		Libro pensamientos = new Libro ("Pensamientos 1", "Stamateas", 245, "2022", Genero.AutoAyuda);
		Libro marte = new Libro ("El planeta Rojo", "Pigna", 120, "2012", Genero.Ficcion);
		Libro fin = new Libro ("El fin del mundo", "Pigna", 160, "2012", Genero.Ficcion);
		biblioteca.agregarLibro(harry1);
		biblioteca.agregarLibro(harry2);
		biblioteca.agregarLibro(conoCT);
		biblioteca.agregarLibro(america);
		biblioteca.agregarLibro(titanic);
		biblioteca.agregarLibro(pensamientos);
		biblioteca.agregarLibro(marte);
		biblioteca.agregarLibro(fin);
				

		Assert.assertEquals(america,biblioteca.ordenarPorFecha().first());
	}
	
}
