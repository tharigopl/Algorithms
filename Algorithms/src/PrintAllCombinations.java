
public class PrintAllCombinations {

	public static int[] input = {1, 2, 3, 4} ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int r = 2;		
		printCombinations(input,r);
		
	}
	
	public static void printCombinations(int[] input, int r){
		calcCombinations(0,"",r);
	}
	
	private static void calcCombinations(int startIndex, String str, int r){
		
		if(r==0){
			System.out.println(str);
			return;
		}
		
		for(; startIndex<input.length;startIndex++){
			String newPrefix = str + input[startIndex]+"";
			calcCombinations(startIndex+1, newPrefix, r-1);
		}
	}

}
