
public class AnagramOfAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ate";
		String str2 = "slate";
		
		
		int[] alpha = new int[256];
		
		for(int i = 0; i < str1.length(); i++){
			alpha[str1.charAt(i)]++;
		}
		
		int consecutive = 0;
		
		for(int i = 0 ; i < str2.length(); i++){
			if(alpha[str2.charAt(i)] == 1){
				
			}
		}
		
	}

}
