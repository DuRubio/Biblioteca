package ar.edu.unlam.pb2;

import java.util.Comparator;

public class ordenadosPorFechaComparator implements Comparator< Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getFechaPublicacion().compareTo(o2.getFechaPublicacion());
		
	}

}
