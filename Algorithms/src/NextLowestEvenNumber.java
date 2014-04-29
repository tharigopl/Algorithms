import java.util.ArrayList;


public class NextLowestEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer input = 34722641;
		nextLowestEvenNumber(input);
	}
	
	public static Integer nextLowestEvenNumber(Integer input){
		String number = String.valueOf(input);
		/*System.out.println(number.length());
		System.out.println(number.substring(number.length() - 2, number.length()));*/
		int count = 0;
		while(count < number.length()){
			
			count++;
		}
		
		return 0;
	}
	
	public static ArrayList<String> permutations(String input){
		
	}
	
	public static ArrayList<String> permutations(String input, String start, int length){
		ArrayList<String> result = new ArrayList<String>();
		if(length == 4){
			System.out.println(input);
		}
		
		for(int i = 0 ; i < input.length(); i++){			
			String prefix = Character.toString(input.charAt(i));
			if(permutations(input, start+1, length+1) == null){
				result.add(prefix);
			}
		}
		
	}

}
