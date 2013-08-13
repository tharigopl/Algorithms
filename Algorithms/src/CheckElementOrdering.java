
public class CheckElementOrdering {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr = "ABD";
		char[] cArr = arr.toCharArray();
		for(int i =0 ; i<cArr.length;i++){
			if(i>0){
				if(cArr[i-1]+1!=cArr[i]){
					System.out.println(i);
				}
			}
		}
		
		
	}

}
