
public class AddLinkedList {
	private Node first=null;
	private static AddLinkedList output = new AddLinkedList();
	private class Node{
		int value;
		Node next;
	}

	public boolean isEmpty(){
		return first == null;
	}
	
	public void insert(int val){
		Node oldFirst = first;
		first = new Node();
		first.value = val;
		first.next = oldFirst;
	}
	
	public Node getFirst(){
		return first;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddLinkedList list1 = new AddLinkedList();
		list1.insert(6);
		list1.insert(1);
		list1.insert(7);
		list1.insert(5);
		
		AddLinkedList list2 = new AddLinkedList();
		list2.insert(2);
		list2.insert(9);
		list2.insert(5);
		
		addList(list1,list2);
		
		if(output!=null){
			Node obj =  output.first;
			while(obj!=null){
				System.out.println(obj.value);
				obj = obj.next;
			}
		}
	}
	
	public static void addList(AddLinkedList list1, AddLinkedList list2){
		
		addListRecurse(list1.getFirst(),list2.getFirst(),0);
	}

	private static void addListRecurse(Node list1, Node list2, int carryOver){
		
		if(list1==null && list2==null){
			
		}else if(list1==null){
			int tempSum = list2.value + carryOver;
			int newCarryOver = 0;
		
			if(tempSum > 9){
				newCarryOver = tempSum / 10;				
			}			 
			output.insert(tempSum%10);			
			addListRecurse(null,list2.next,newCarryOver);
		}else if(list2==null){
			int tempSum = list1.value + carryOver;
			int newCarryOver = 0;
		
			if(tempSum > 9){
				newCarryOver = tempSum / 10;				
			}			 
			output.insert(tempSum%10);			
			addListRecurse(list1.next,null,newCarryOver);
		}else{
			int tempSum = list1.value + list2.value + carryOver;
			int newCarryOver = 0;
		
			if(tempSum > 9){
				newCarryOver = tempSum / 10;				
			}			 
			output.insert(tempSum%10);			
			addListRecurse(list1.next,list2.next,newCarryOver);
		}
	}
	
}
