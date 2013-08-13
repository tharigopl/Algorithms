import java.util.Arrays;


public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("Dog");
		StringBuffer str2 = new StringBuffer("Goda");
		System.out.println(anagram(str1,str2));
	}
	
	public static boolean anagram(StringBuffer str1, StringBuffer str2){
		return anagramCheck(str1.toString(), str2.toString());
	}
	
	private static boolean anagramCheck(String str1, String str2){
		char[] charArr1 = str1.toString().toLowerCase().toCharArray();
		Arrays.sort(charArr1);
		
		char[] charArr2 = str2.toString().toLowerCase().toCharArray();
		Arrays.sort(charArr2);
				
		return new String(charArr1).equalsIgnoreCase(new String(charArr2).toString());
		
	}

}
