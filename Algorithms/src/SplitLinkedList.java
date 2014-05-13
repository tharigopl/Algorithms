
public class SplitLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		LinkedList firstHalf = new LinkedList();
		firstHalf.first = list.first;
		LinkedList secondHalf = new LinkedList();
		if(list.first.next != null)
			secondHalf.first = list.first.next;
		
		while(true){
			
			firstHalf.first = list.first;
			if(list.first.next != null)
				secondHalf.first = list.first.next;
			
			
			
		}
		
	}

}
