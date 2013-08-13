public class PartitionLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node linkedList1 = new Node(10,null);
		Node linkedList2 = new Node(89,linkedList1);
		Node linkedList3 = new Node(34,linkedList2);
		Node linkedList4 = new Node(13,linkedList3);
		Node linkedList5 = new Node(34,linkedList4);
		Node linkedList6 = new Node(5,linkedList5);
		Node linkedList7 = new Node(12,linkedList6);
		Node linkedList8 = new Node(65,linkedList7);
		Node linkedList9 = new Node(23,linkedList8);	
				
		Node node = partition(linkedList9, 25);
		
		while(node!=null){
			System.out.println(node.value);
			node = node.next;
		}
		
	}
	
	public static Node partition(Node first, int pivot){
		Node beforePivot = null;
		Node afterPivot = null;
		Node node = first;
		
		while(node!=null){
			Node next = node.next;
			if(node.value<pivot){
				node.next = beforePivot;
				beforePivot = node;
			}
			else{
				node.next = afterPivot;
				afterPivot = node;
			}
			node = next;
		}

		Node head = beforePivot;
		if(beforePivot==null){
			return afterPivot;
		}else{
			while(beforePivot.next!=null){
				beforePivot=beforePivot.next;
			}
			beforePivot.next = afterPivot;
			return head;
		}	
		
	}

}
