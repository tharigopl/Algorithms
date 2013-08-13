
public class StringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcccccaaa";
		int sizeOfStr = str.length();
		int temp = 1;
		StringBuffer strBuffer = new StringBuffer();
		char last = ' ';
		if(str.charAt(0)!=' '){
			last = str.charAt(0);
		}
		for(int i = 1; i < str.length(); i++){			
			if(str.charAt(i)==last){				
				temp++;
			}else{				
				strBuffer.append(last);
				strBuffer.append(temp);
				last = str.charAt(i);
				temp = 1;
			}
		}
		strBuffer.append(last);
		strBuffer.append(temp);
		
		System.out.println(strBuffer.toString());
	}

}
