
public class OddEvenLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		LinkedList evenList = new LinkedList();
		LinkedList oddList = new LinkedList();
		
		if(list.first != null)
			oddList.add(list.first.key);
		if(list.first.next != null)
			evenList.add(list.first.next.key);
		
		Node head = list.first;
		Node currentOdd = head;
		head = head.next.next;
		Node currentEven = head.next;
		
		while(head != null){
			currentOdd.next = head;
			currentOdd = currentOdd.next;
			if(head.next != null){
				currentEven.next = head.next;
				currentEven = currentEven.next;
			}
			head = head.next.next;
		}
		
		while(oddList.first!=null){
			System.out.println(oddList.first.key);
			oddList.first = oddList.first.next;
		}
		
		while(evenList.first!=null){
			System.out.println(evenList.first.key);
			evenList.first = evenList.first.next;
		}
		
	}

}
