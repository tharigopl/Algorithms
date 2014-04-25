
public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "wwwwaaadexxxxxx";
		runLengthEncoding(input);
	}
	
	public static void runLengthEncoding(String input){
		
		char[] inputArr = input.toCharArray();
		
		char temp = '\0';
		char prev = '\0';
		if(inputArr.length > 1){
			prev = inputArr[0];
		}
		String output = "";
		int count = 1;
		for(int i = 1 ; i < inputArr.length; i++){
			if(prev == inputArr[i]){
				count++;
				prev = inputArr[i];
			}else{
				output += prev + "" + count;
				count = 1;
				prev = inputArr[i];
			}
		}		
		
		output += prev + "" + count;
		
		System.out.println(output);
	}

}
