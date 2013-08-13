import java.util.Iterator;


public class Example {

	private static int length = 0;
	private static int MAX = 9999;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Stack<Integer> stack = new Stack<Integer>();
		stack.push(20);
		stack.push(10);
		stack.push(50);
		stack.push(30);
		Iterator itr =stack.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		stack.reverse();
		
		itr =stack.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		int[] arr = {2,3,1,1,1};
		length = arr.length;
		checkPath(arr);
		System.out.println(MAX);
	}
	
	public static void checkPath(int[] arr){
		
			checkRecursivePath(arr, 0, 0);				
		
	}
	
	private static int checkRecursivePath(int[] arr, int indexToStartFrom, int steps){
		boolean bool = false;
		if(arr[indexToStartFrom] >= 0 && indexToStartFrom + 1 >= length){
			MAX = Math.min(MAX, steps);
		}else if(arr[indexToStartFrom] == 0 && indexToStartFrom + 1 < length){
			
		}
		else{
			for(int i = arr[indexToStartFrom];i>0;i--){
				int newStartIndex = i + indexToStartFrom;
				checkRecursivePath(arr,newStartIndex,steps+1);
					//return steps;
			}
		}
		return MAX;
	}

}
