package assign2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * @author Lopez
 *
 */
public class Part2 {


	public static void main(String[] args) {
		
		List <Integer> exampleList = Arrays.asList(23, 5534, 10, 942, 41, 98, 954, 461);
		
		System.out.println("Example list: " + exampleList);
		
		rightDigitInt rightDigit = (List<Integer> x) ->  x.stream().map(y -> y % 10).collect(Collectors.toList());
		
		List<Integer> results = rightDigit.rightDigit(exampleList);
		
		System.out.println("results: " + results);
		
		

	}

}

@FunctionalInterface
interface rightDigitInt{
	
	public List<Integer> rightDigit(List<Integer> list);
	
}
