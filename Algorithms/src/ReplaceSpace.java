import java.util.regex.Pattern;


public class ReplaceSpace {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is the end";
		int size = str.length();
		int noOfSpaces = 0;
		char[] charArr = str.toCharArray();
		for(int i=0; i<charArr.length; i++){
			if(charArr[i]==' '){
				 noOfSpaces++;
			}
		}
		
		int newLength = (charArr.length - noOfSpaces) + (noOfSpaces * 3);
		
		char[] newChar = new char[newLength];
		
		for(int i=charArr.length-1;i>=0;i--){
			if(charArr[i] == ' '){
				newChar[newLength-1]='0';
				newChar[newLength-2]='2';
				newChar[newLength-3]='%';
				newLength-=3;
			}
			else{
				newChar[newLength-1] = charArr[i];
				newLength-=1;
			}
		}
		
		System.out.println(new String(newChar).toString());
		
	/*	System.out.println(replaceAllSpacesCharArr(charArr));
		System.out.println(replaceAllSpaces(str));*/
	}
	
	/*public static String replaceAllSpacesCharArr(char[] charArr){		
		for(int i = 0; i < charArr.length; i++){
			if(charArr[i] == ' '){
				
			}
		}
	}
	
	public static String replaceAllSpaces(String str){		
		return str.replaceAll(" ", "%20");
	}*/

}
