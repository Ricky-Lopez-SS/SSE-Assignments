/**
 * 
 */
package LaFiaS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author ricky lopez
 *
 */
public class Part1 {

	public static void main(String[] args) {

		String[] nameArray = { "Steve", "Carol", "Benjamin", "Marcus", "Cole" };
		List<String> names = Arrays.asList(nameArray);

		System.out.print("Array of names: ");
		//names.stream().forEach((s) -> System.out.format("%s, ", s)); //for fun lol
		for(String s : names) System.out.format("%s, ", s);
		
		System.out.format("%nPlease select the type of sorting you would like to perform. You select by typing in the respective sorting type.%n");
		System.out.format("Sorting Types:%n Alphabetically%n Size (ascending)%n Size (descending)%n Contains E%n");

		Scanner scnnr = new Scanner(System.in);
		String input = "";

		if (scnnr.hasNextLine())
			input = scnnr.nextLine().toLowerCase();

		if (input.contains("alphabetically")) //alphabetic sort
			names.stream().sorted().forEach((s) -> System.out.println(s));

		else if (input.contains("size (ascending)")) //ascending size sort
			names.stream().sorted(Comparator.comparingInt(String::length)).forEach((s) -> System.out.println(s));

		else if (input.contains("size (descending)")) //descending size sort
			names.stream().sorted(Comparator.comparingInt(String::length).reversed())
					.forEach((s) -> System.out.println(s));
		else if (input.contains("contains e")) { //contains E sort
			
			System.out.println("Should we use a static helper method? (type in yes or no)");

			if (scnnr.hasNext())
				input = scnnr.nextLine().toLowerCase();

			if (input.equals("yes")) {
				Arrays.sort(nameArray, Comparator.comparingInt(Helper::order));
				Arrays.asList(nameArray).stream().forEach(System.out::println);

			} else {
				names.stream().sorted(Comparator.comparingInt((s) -> {
					if (s.contains("e")) {
						return -1;
					}
					return 0;

				})).forEach(System.out::println);
			}
		} else
			System.out.println("Sorry, I did not quite catch that. Please try rerunning the program.");
		
		scnnr.close();

	}

}

class Helper {

	public static int order(String x) {
		if (x.contains("e")) {
			return -1;
		}
		return 0;
	}
}
