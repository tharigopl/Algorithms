
public class PalindromeDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "acgtgtcaaaatcg";
		//String input = "acgttgca";
		char[] inputArr = input.toCharArray();
		
		palindromeSeq(inputArr);
		
	}
	
	public static void palindromeSeq(char[] inputArr){
		
		int i=0;
		int j=inputArr.length-1;
		
		System.out.println(recursivePalindrome(i,j,inputArr));
		
	}
	
	public static int recursivePalindrome(int i, int j, char[] inputArr){
		int newLength = 0;		
		if(i==j){
			newLength = 1;
		}
		else if(j==i+1 && inputArr[i]!=inputArr[j]){
			newLength = 1;
		}
		else if(j==i+1 && inputArr[i]==inputArr[j]){
			newLength = 2;
		}
		else if(inputArr[i]==inputArr[j] && j>i){
			
			newLength = 2 + recursivePalindrome(i+1,j-1,inputArr);
		}
		else if(inputArr[i]!=inputArr[j] && j>i){
			int max1 = recursivePalindrome(i,j-1,inputArr);
			int max2 = recursivePalindrome(i+1,j,inputArr);
			newLength = Math.max(max1,max2);
		}
			
		
		return newLength;
	}

}
