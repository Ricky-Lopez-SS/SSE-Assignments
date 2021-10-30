package tests;

import LaFiaS.Part2and3;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

	/**
	 * 
	 * @note THIS DOES NOT WORK BECAUSE OF COMPLEX PROJECT STRUCTURE AND BUILD PATH! WILL FIX FOR NEXT PROJECT.
	 *
	 */


public class Part2and3test {
	
	List<Integer> numList1 = Arrays.asList(5, 3, 85, 22);
	List<Integer> numList2 = Arrays.asList(-5, -3, -85, -23);
	
	List<String> nameList1 = Arrays.asList( "Steve", "Carol", "Benjamin", "Marcus", "Cole" , "add", "aim", "aid" , "adam" , "con" , "Ace");
	
	@Test
	public void equalsTest() {
		assertEquals(Part2and3.part2(numList1), "o5, o3, o85, e22");
		assertEquals(Part2and3.part2(numList2), "o-5, o-3, o-85, o-23");
	}
	

}
