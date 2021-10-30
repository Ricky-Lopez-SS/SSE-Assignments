package assign2;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Ricky Lopez
 *
 */
public class Part1 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a value for how many test cases there are. Then, input the test cases following the proper format of space-separated integers.");
		System.out.println("(NOTE: you must type the inputs in line by line!)");
		
		Scanner scnnr = new Scanner(System.in);
		int numOfCases = 0;
		int keyInput, valueInput = 0;
		String result = "";
		
		
		
		funcInt isOdd = (x) -> {
			if(x % 2 == 0) return false;
			return true;
		};
		
		funcInt isPrime = (x) -> {
			for(int i = 2; i < x/2; i++) {
				if( x % i == 0) return false;
			}
			return true;
			
		};
		
		funcInt isPalindrome = (x) -> {
			
			String intString = Integer.toString(x);
			int left, right;
			left = 0; right = intString.length() - 1;

			while( left < right ) {
				if(intString.charAt(left) != intString.charAt(right)) return false;
				left++; right--;
			}
			
			return true;

			//TODO: determine whether I need to write two different cases for even-numbered and odd-numbered string lengths. 
			
		};
		
		if(scnnr.hasNextLine()) numOfCases = Integer.parseInt(scnnr.next());
		
		for(int i = 0; i < numOfCases; i++) {
			keyInput = Integer.parseInt(scnnr.next()); // integer value which determines which function to use.
			valueInput = Integer.parseInt(scnnr.next());
			
			if(keyInput == 1) {
				
				if(isOdd.func(valueInput)) result += "ODD\n";
				else result += "EVEN\n";
					
				
			}else if (keyInput == 2) {
				
				if(isPrime.func(valueInput)) result += "PRIME\n";
				else result += "COMPOSITE\n";
				
			}else if(keyInput == 3) {
				
				if(isPalindrome.func(valueInput)) result += "PALINDROME\n";
				else result += "NOT PALINDROME\n";
				
			}else {
				System.out.println("Sorry, that is not a valid input. Please try running the program again.");
				scnnr.close();
				return;
			}
			
			
		}
		
		System.out.println(result);
			
			
		scnnr.close();

	}

}

@FunctionalInterface
interface funcInt{
	
	public boolean func(int x);
}

