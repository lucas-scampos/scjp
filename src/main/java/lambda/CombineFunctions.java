package lambda;

import java.util.Arrays;
import java.util.function.Function;

public class CombineFunctions {
	
	public static void main(String[] args) {
		Function<String, Integer> parseInt = Integer::parseInt;
		
		Function<Integer, Integer> absInt = Math::abs;
		
		Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);
		Function<String, Integer> parseAndAbsIntCompose = absInt.compose(parseInt);
		
		Arrays.stream("4, -9, 16".split(", "))
				.map(parseAndAbsInt)
				.forEach(System.out::println);
	}
	
}