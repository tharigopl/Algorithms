import java.util.Collections;
import java.util.PriorityQueue;


public class SameCharactersAtDDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String input = "geeksforgeeks";
		String input = "abcdaaa";
		char[] a = input.toCharArray();
		
		//int[] a = {1,2,3,4,5,1,2,3,4};
		
		PriorityQueue<Integer> priorityQInput = new PriorityQueue<Integer>(a.length,Collections.reverseOrder());
		for(int i = 0 ; i < a.length ; i++)
			priorityQInput.add(Character.getNumericValue(a[i]));
			// priorityQInput.add(a[i]);
		
		while(priorityQInput.peek() != null){
			System.out.print(priorityQInput.poll()+" ");
		}
		/*for(Integer i : priorityQInput){
			//System.out.print(i+" ");
			System.out.println();
		}*/
	}

}
