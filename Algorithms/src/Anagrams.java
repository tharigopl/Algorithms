import java.util.Arrays;


public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("Dog");
		StringBuffer str2 = new StringBuffer("god");
		System.out.println(anagram(str1,str2));
	}
	
	public static boolean anagram(StringBuffer str1, StringBuffer str2){
		//return anagramCheck(str1.toString(), str2.toString());
		return anagramCheckUsingCount(str1.toString(), str2.toString());
	}
	
	private static boolean anagramCheck(String str1, String str2){
		char[] charArr1 = str1.toString().toLowerCase().toCharArray();
		Arrays.sort(charArr1);
		
		char[] charArr2 = str2.toString().toLowerCase().toCharArray();
		Arrays.sort(charArr2);
				
		return new String(charArr1).equalsIgnoreCase(new String(charArr2).toString());
		
	}
	
	private static boolean anagramCheckUsingCount(String str1, String str2){
		int[] base = new int[256];
		for(int i = 0 ; i < base.length; i++){
			System.out.print(" "+base[i]);
		}
		char[] charArr1 = str1.toString().toLowerCase().toCharArray();
		char[] charArr2 = str2.toString().toLowerCase().toCharArray();
		for(Character c : charArr1){
			base[(int)c]++;
			// System.out.println((int)c);
		}
		
		for(char c : charArr2){
			base[(int)c]++;
			// System.out.println((int)c);
		}
		
		for(int i = 0 ; i < base.length; i++){
			if(base[i] != 0){
				if(base[i]%2 != 0){
					return false;
				}
			}
		}
		
		return true;	
		
	}

}
