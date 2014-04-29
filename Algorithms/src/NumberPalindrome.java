import java.util.Stack;


public class NumberPalindrome {
	public static int original;
	public static Stack<Integer> obj = new Stack<Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 121;
		original = number;
		System.out.println(checkPalindrome(number));
		
	}

	public static boolean checkPalindrome(int number){
		if(number>=0 && number<10){
			return (number == original%10);
		}
		checkPalindrome(number/10);
		original = original/10;
		
		return number%10 == original%10;  
		
	} 
}
