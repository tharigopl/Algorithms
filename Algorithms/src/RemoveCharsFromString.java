
public class RemoveCharsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "aacacc";
		// String input = "ababac";
		
		System.out.println(removebcandcRecursively(input, 0));
		
	}

	public static String removebcandc(String input){
		
		String temp = "";
		String output = "";
		String prev = "";
		prev = input.charAt(0)+"";
		for(int i = 0; i < input.length(); i++){
			String current = String.valueOf(input.charAt(i));
			
			if("ac".equalsIgnoreCase(prev + current)){
				output = output.substring(0, output.length() - 1);
			}else if("b".equalsIgnoreCase(current)){
				// output += current;
			}else if("a".equalsIgnoreCase(current)){
				output += current;
			}else{
				output += current;
			}
			prev = String.valueOf(input.charAt(i));
		}
		
		return output;
		
	}
	
	public static String removebcandcRecursively(String input, int index){
	
		String current = "";
		
		
		if(index == input.length()){
			return "";
		}else{
			current = String.valueOf(input.charAt(index));
			/*if(current.equalsIgnoreCase("b")){
				input = input.substring(0, index) + input.substring(index + 1, input.length());
			}*/
			
			String temp = removebcandcRecursively(input, index + 1);
			
			if(!current.equalsIgnoreCase("b")){
				if(temp.length() > 1){
					if("ac".equalsIgnoreCase(current + temp.substring(0, 1))){
						current = temp.substring(1, temp.length());
					}else{
						current += temp;
					}
				}else{
					if("ac".equalsIgnoreCase(current + temp)){
						current = temp.substring(1, temp.length());
					}else{
						current += temp;
					}
				}
			}else{
				current = temp;
			}
		}
		
		return current;
		
	}
	
	private static String removebcandc(char[] input){
		
		
		
		
		return input.toString();
	}
}
