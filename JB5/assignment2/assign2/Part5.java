package assign2;
/**
 * 
 */


/**
 * @author Lopez
 *
 */
public class Part5 {

	
	public static void main(String[] args) {
		
		
		/* modify these values for testing*/
		int[] arr = {1, 2, 4, 8, 1};
		int target = 14;
		/*								  */
		
		System.out.print("Example array: [ ");
		for(int i : arr) System.out.print(i + " ");
		System.out.println("]");
		
		System.out.println("Target: " + target);
		
		
		
		if(groupSumClump(0, arr, target)) System.out.println("There exists a subset of integers that sum up to the specified target in this array.");
		else System.out.println("There is no subset of integers in this array that can sum up to the specified target.");
		
		
		
	}
	
	
	public static boolean groupSumClump(int index, int[] arr, int target) {
	
		
		if(target == 0) return true; //terminating case #1
		
		if(index == arr.length - 1) return false; //terminating case #2
		
		int increment = 1;
		int clump = arr[index];
		
		
		//additional constraint
		if(index < arr.length - 1) {
			for(int i = index + 1; i < arr.length; i++) {
				if (arr[index] == arr[i]) {
					
					clump += arr[i];
					increment++;
					
				}
			}
		}
		
		return groupSumClump(index+increment, arr, target) || groupSumClump(index+increment, arr, (target - clump));
		
	}

}
