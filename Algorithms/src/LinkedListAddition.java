import java.util.ArrayList;
import java.util.LinkedList;


public class LinkedListAddition {

	public static ArrayList<Integer> output = new ArrayList<Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		LinkedList<Integer> linkedAdd1 = new LinkedList<Integer>();
		linkedAdd1.add(6);
		linkedAdd1.add(1);
		linkedAdd1.add(7);
		
		LinkedList<Integer> linkedAdd2 = new LinkedList<Integer>();
		linkedAdd2.add(5);
		linkedAdd2.add(9);
		linkedAdd2.add(2);
		add(linkedAdd1,linkedAdd2);
		for(Integer i : output){
			System.out.print(i);
		}
	}

	public static void add(LinkedList<Integer> list1, LinkedList<Integer> list2){
		//output = new Node();
		addRecurse(list1, list2, 0);
	}
	
	private static void addRecurse(LinkedList<Integer> list1, LinkedList<Integer> list2, int carryOver){
		int tempSum,newCarryOver = 0;
		if(list1.isEmpty() && list2.isEmpty()){
			output.add(carryOver);
		}else if(list1.isEmpty()){
			tempSum = list2.remove()+carryOver;
			if(tempSum>9) newCarryOver = tempSum / 10;			
			addRecurse(list1,list2,newCarryOver);
			output.add(tempSum%10);
		}else if(list2.isEmpty()){
			tempSum = list1.remove()+carryOver;
			if(tempSum>9) newCarryOver = tempSum / 10;			
			addRecurse(list1,list2,newCarryOver);
			output.add(tempSum%10);
		}else{
			tempSum = list1.remove()+list2.remove() + carryOver;	
		
			if(tempSum > 9){
				newCarryOver = tempSum / 10;				
			}		
			
			addRecurse(list1,list2,newCarryOver);
			output.add(tempSum%10);
			
		}
		
	}
	
}
