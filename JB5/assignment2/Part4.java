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
public class Part4 {

	public static void main(String[] args) {
		
		List<String> exampleList = Arrays.asList("xylophone", "extrapolate", "polar bear", "koauh", "hawaii", "xerox");
		
		noXInt noX = (x) -> x.stream().map((y) -> y.replaceAll("x", "")).collect(Collectors.toList());
		
		List<String> result = noX.noXFunc(exampleList);
		
		System.out.println(result);
		
		
	}

}

interface noXInt{
	
	public List<String> noXFunc(List<String> list);
	
}
