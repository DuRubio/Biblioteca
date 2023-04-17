package ar.edu.unlam.pb2;

import java.util.Comparator;

public class ordenadosPorTamanioComparator implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getCantidadPaginas().compareTo(o2.getCantidadPaginas());
		
	}

}
