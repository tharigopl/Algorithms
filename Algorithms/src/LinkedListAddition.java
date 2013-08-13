import java.util.LinkedList;


public class LinkedListAddition {

	public static LinkedList output;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node linkedList1 = new Node(6,null);
		Node linkedList2 = new Node(1,linkedList1);
		Node linkedList3 = new Node(7,linkedList2);
		
		Node linkedList4 = new Node(2,null);
		Node linkedList5 = new Node(9,linkedList4);
		Node linkedList6 = new Node(5,linkedList5);
		//add(linkedList3, linkedList6);
		
		
		LinkedList<Integer> linkedAdd1 = new LinkedList<Integer>();
		linkedAdd1.add(6);
		linkedAdd1.add(1);
		linkedAdd1.add(7);
		
		LinkedList<Integer> linkedAdd2 = new LinkedList<Integer>();
		linkedAdd2.add(5);
		linkedAdd2.add(9);
		linkedAdd2.add(2);
		add(linkedAdd1,linkedAdd2);
		
	}

	public static void add(LinkedList<Integer> list1, LinkedList<Integer> list2){
		//output = new Node();
		addRecurse(list1, list2, 0);
	}
	
	private static void addRecurse(LinkedList<Integer> list1, LinkedList<Integer> list2, int carryOver){
		
		if(list1==null && list2==null){
			
		}else if(list1==null){
			
		}else if(list2==null){
			
		}else{
			int tempSum = list1.remove()+list2.remove() + carryOver;
			int newCarryOver = 0;
		
			if(tempSum > 9){
				newCarryOver = tempSum / 10;				
			}			 
			output.add(tempSum%10);
			
			addRecurse(list1,list2,newCarryOver);
			
			
		}
		
	}
	
}
