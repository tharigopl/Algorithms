
public class Plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1298321";
		
		System.out.println(largestPalindromicSubsequence(input));
	}
		

	public static boolean isPalindrome(String input){
		return isPalindrome(input.toCharArray());
	}
	
	private static boolean isPalindromeAnotherMethod(char[] input, int start, int end){
		boolean result = true;
		for(int i = 0 ; i<=(start+end)/2; i++){
			if(input[i]==input[start+end-1]){
				continue;
			}else{
				return false;
			}
		}
		return result;
	}
	
	private static boolean isPalindrome(char[] input){
		boolean result = true;
		if(input.length == 0 || input.length == 1){
			return false;
		}else{			
			int i = 0;
			int j = input.length-1;
			boolean notDone = true;
			while(notDone){	
				if(i == j){
					notDone = false;
				}else if(i+1 == j){
					notDone = false;
				}
				if(input[i] == input[j]){
					i++;j--;
				}else{
					notDone = false;
					result = false;
				}			
				
			}
		}
		return result;
	}
	
	public static Integer largestPalindromicSubsequence(String input){		
		return largestPalindromicSubsequence(input.toCharArray(), 0, input.length()-1);
	}
	
	private static Integer largestPalindromicSubsequence(char[] input, int i, int j){
		int result = 0;
		
		if(i == j){
			result = 1;
		}else if(j == i+1 && input[i] == input[j] ){
			result = 2;
		}else if(j == i+1 && !(input[i] == input[j])){
			result = 1;
		}else if(input[i] == input[j] && j>i){
			result = 2 + largestPalindromicSubsequence(input, i+1, j-1);
		}
		else if(input[i] != input[j] && j>i){
			result = Math.max(largestPalindromicSubsequence(input, i+1, j), largestPalindromicSubsequence(input, i, j-1));			
		}
		
		return result;
	}
	
	public static Integer largestPalindromicSubsequence(char[] input){
		int result = 0;
		
		Integer[][] memoization = new Integer[input.length][input.length];
		
		for(int i = 0 ; i < input.length; i++){
			for(int j = input.length-1; j >= 0; j++){
				if(i == j && input[i] == input[j]){
					
				}
			}
		}
		
		return result;
	}
}
