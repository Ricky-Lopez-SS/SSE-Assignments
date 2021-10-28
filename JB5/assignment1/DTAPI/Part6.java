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
public class Part6 {

	public static void main(String[] args) {

		System.out.println("Please enter which number month you would like to see the Mondays for.");
		
		Scanner scnnr = new Scanner(System.in);
		
		int input = 0;
		
		if(scnnr.hasNextLine()) input = Integer.parseInt(scnnr.next());
		
		LocalDate date = LocalDate.now().withMonth(input);
		
		
		for(int i = 1; i <= date.lengthOfMonth(); i++) {
			if(date.withDayOfMonth(i).getDayOfWeek().getValue() == 1)
				System.out.println(date.withDayOfMonth(i));
		}
		
		scnnr.close();
		

	}

}
