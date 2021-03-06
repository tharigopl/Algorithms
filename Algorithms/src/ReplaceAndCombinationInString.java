import java.util.Iterator;


public class ReplaceAndCombinationInString {

	public static char[] cArr;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1??";
		combination(str);		
	}
	
	public static void combination(String input){
		cArr = input.toCharArray();
		System.out.println(cArr.length);
		recursiveCombination(0,"");
	}
	
	public static void recursiveCombination(int startIndex, String base){
		
		String newPrefix = "";
		System.out.println(base);
		
		if(startIndex == cArr.length)
			return;
		
		for(;startIndex<cArr.length;startIndex++){
			if(cArr[startIndex]=='?'){			
				newPrefix = base + '0';
				recursiveCombination(startIndex+1, newPrefix);
				newPrefix = base + '1';
				recursiveCombination(startIndex+1, newPrefix);
				
			}else{
				newPrefix = base + cArr[startIndex];
				recursiveCombination(startIndex+1, newPrefix);			
			}
		}
	}

}

