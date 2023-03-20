package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Object> println = System.out::println;
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
			System.out.print(nums + " ");
			System.out.println("\n");
		
		Function<Integer, String> binario = n -> 
			Integer.toBinaryString(n);
			
		UnaryOperator<String> inverter = n -> 
			new StringBuilder(n).reverse().toString();
	
		Function<String, Integer> inteiro = n -> 
			Integer.parseInt(n, 2);
		
		nums.stream()
			.map(binario)
			.map(inverter)
			.map(inteiro)
			.forEach(println);
			
	}
}
