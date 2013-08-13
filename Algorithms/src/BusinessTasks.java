import java.util.ArrayList;
import java.util.Arrays;


public class BusinessTasks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = {"a","b","c","d","e"}; 
		int n = 3;
		System.out.println(getTask(list,n));
	}
	
	public static String getTask(String[] list, int n){
		
		ArrayList arr = new ArrayList(Arrays.asList(list));
		
		int count = 0;
		/*while(arr.size()!=1)
		{
			for(int i = 0; i<arr.size();i++){
				if(count == n-1){
					arr.remove(i);
					count = 0;
				}
				else
					count++;				
			}
		}*/
		
		int end = 0;
		
		while(end!=list.length-1){
			for(int i = 0; i<list.length;i++){
				if(list[i]!=null){
					if(count == n-1){
						list[i]=null;
						count = 0;
						end++;
					}
					else
						count++;
				}
			}
			
		}
		String str = "";
		for(int j=0;j<list.length;j++){
			if(list[j]!=null)
				str = list[j].toString();
		}
		return str;
	}

}
