import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;


public class SortBooks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] field1 = { "J R R Tolkien", "THE Jungle BOOK" };
		String[] field2 = { "THE HOBBIT", "RUDYARD KIPLING" };
		int[] answer = checkManually(field1, field2);
		for(int i=0;i<answer.length;i++){
			System.out.println(answer[i]);			
		}
	}	

	public static int[] checkManually(String[] field1, String[] field2){
		HashMap hmDict = new HashMap();
		hmDict.put("the", "the");
		hmDict.put("and", "and");
		hmDict.put("of", "of");
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		
		for(int i=0;i<field1.length;i++){
			
			if(field1[i].length()-field1[i].replace(" ", "").length() > 2 
					|| field2[i].length()-field2[i].replace(" ", "").length() > 2){				
				continue;
			}
			else if(
					Arrays.asList(field1[i].toLowerCase().split(" ")).contains("the") ||
					Arrays.asList(field1[i].toLowerCase().split(" ")).contains("and") ||
					Arrays.asList(field1[i].toLowerCase().split(" ")).contains("of") ||
					Arrays.asList(field2[i].toLowerCase().split(" ")).contains("the") ||
					Arrays.asList(field2[i].toLowerCase().split(" ")).contains("and") ||
					Arrays.asList(field2[i].toLowerCase().split(" ")).contains("of")					
					){
				continue;
				
			}else{
				result.add(i);
			}
		}
		int[] ret = null;
		if(result.size()!=0){
			ret = new int[result.size()];
		    Iterator<Integer> iterator = result.iterator();
		    for (int i = 0; i < ret.length; i++)
		    {
		        ret[i] = iterator.next().intValue();
		    }
		}else{
			ret = new int[1];
			ret[0] = 0;
		}
		return ret;
	}

}
