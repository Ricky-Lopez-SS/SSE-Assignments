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
public class Part5 {

	public static void main(String[] args) {

		System.out.println("Please input a year.");

		int input = 0;
		Scanner scnnr = new Scanner(System.in);

		if (scnnr.hasNextLine())
			input = Integer.parseInt(scnnr.next());

		LocalDate date = LocalDate.ofYearDay(input, 1);

		for (int i = 1; i <= 12; i++)
			System.out.format("%s: %d days%n", date.withMonth(i).getMonth(), date.withMonth(i).lengthOfMonth());

		scnnr.close();

	}

}
