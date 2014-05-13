import java.util.LinkedList;


public class EvenOddLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		LinkedList<Integer> evenList = new LinkedList<Integer>();
		LinkedList<Integer> oddList = new LinkedList<Integer>();
		Integer temp = 0;
		if((temp = list.remove()) != null)
			oddList.add(temp);
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
