import java.util.HashMap;
import java.util.Iterator;

public class UniqueSubstringsInString {

	public static char[] input = {'k','i','n','c','e','n','v','i','z','h'} ;
	//public static char[] input = {'k','i','n'} ;
	public static int x = 0;
	public static HashMap<String, Integer> hm = new HashMap<String, Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int r = 3;		
		printCombinations(input);
		System.out.println(x);
		Iterator itr = hm.keySet().iterator();
		int t = 0;
		while(itr.hasNext()){
			System.out.println(itr.next());
			t++;
		}
		System.out.println(t);
	}

	public static void printCombinations(char[] input){
		for(int i = 0 ; i < input.length; i++){
			calcCombinations(i,"");
		}
	}

	private static void calcCombinations(int startIndex, String str){

		if(startIndex == input.length){
			return;
		}
		//for(; startIndex<input.length;startIndex++){
			String newPrefix = str + input[startIndex]+"";
			System.out.println(newPrefix);
			x++;
			//if(!hm.containsKey(newPrefix)){
				hm.put(newPrefix, 0);
			//}
			calcCombinations(startIndex+1, newPrefix);
		//}
	}

}