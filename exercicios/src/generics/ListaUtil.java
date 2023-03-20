package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() -1);
	}
	
	public static <t> t getUltimo2(List<t> lista) {
		return lista.get(lista.size() -1);
	}
}
