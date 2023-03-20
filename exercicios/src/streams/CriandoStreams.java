package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
				//Consumer recebe um parametro e não retorna nada
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		// criando streams a partir de um Array
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"}; 
		Stream.of(maisLangs).forEach(print); 
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print); // imprime a partir da posição no array
		
		// criando streams a partir de uma colections( List )
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print); // imprime de forma desordenada por executar em paralelo

		// criando streams infinitas(generate e iterate). Descomente e excute para testar
		//Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 5).forEach(println);
		
		
		
		
		
		
	}
}
