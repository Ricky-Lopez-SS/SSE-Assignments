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
public class Part3 {

	public static void main(String[] args) {
		
		List <Integer> exampleList = Arrays.asList(23, 5534, 10, 942, 41, 98, 954, 461);
		
		System.out.println("Example list: " + exampleList);
		
		doublingInt doubling = (List<Integer> x) -> x.stream().map(y -> y*2).collect(Collectors.toList());
		
		List <Integer> result = doubling.doublingFunc(exampleList);
		
		System.out.println("results:" + result);
		
	}

}

interface doublingInt{
	
	public List<Integer> doublingFunc(List <Integer> list);
	
}
