/**
 * 
 */
package LaFiaS;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author ricky lopez
 *
 */
public class Part2and3 {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(5, 3, 85, 23, 92, 944, 1, 19, 43, 22, 76, 90);
		
		List<String> nameList = Arrays.asList( "Steve", "Carol", "Benjamin", "Marcus", "Cole" , "add", "aim", "aid" , "adam" , "con" , "Ace");

		System.out.format("Part 2: %n%s%n", part2(numList));
		
		System.out.println("Part 3: ");
		part3(nameList).stream().forEach((s) -> System.out.format("%s, ", s));

	}

	public static String part2(List<Integer> list) {

		return list.stream().map((x) -> {
			if (x % 2 == 0)
				return x.toString() + 'e';
			return x.toString() + 'o';
		}).reduce("", (substring, nextString) -> substring + nextString + ", ");

	}
	
	public static List<String> part3(List<String> list) {
		
		return list.stream()
				.filter((s) -> s.charAt(0) == 'a' && s.length() == 3)
				.collect(Collectors.toList());
		
	}

}
