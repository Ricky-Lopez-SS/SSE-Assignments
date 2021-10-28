/**
 * 
 */
package DTAPI;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author rickylopez
 *
 */
public class Part7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Please enter a valid date in the form of YYYY-MM-DD.");
		
		Scanner scnnr = new Scanner(System.in);
		String input = "";
		
		if(scnnr.hasNextLine()) input = scnnr.next();
		
		LocalDate date = LocalDate.parse(input);
		
		if(date.getDayOfMonth() == 13 && date.getDayOfWeek().getValue() == 5) {
			System.out.println("This date does occur on Friday the 13th!");
			scnnr.close();
			return;
		}
		
		System.out.println("Sorry, this date does not occur on Friday the 13th.");
		
		
		scnnr.close();

	}

}
