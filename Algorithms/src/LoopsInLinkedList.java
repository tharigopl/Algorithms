import java.util.Iterator;

public class LoopsInLinkedList implements Iterable{

	private Node first=null;
	private static LoopsInLinkedList output = new LoopsInLinkedList();
	
	private class ListIterator implements Iterator{
		
		private Node current = first;	
		
		@Override
		public boolean hasNext() {
			return current!=null;			
		}

		@Override
		public Integer next() {
			int item = current.value;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}		
	}
	
	private class Node {
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
		LoopsInLinkedList list1 = new LoopsInLinkedList();
		list1.insert(6);
		list1.insert(1);
		list1.insert(7);
		list1.insert(5);
		list1.insert(9);
		
		Node createLoop = list1.getFirst().next.next.next;
		
		list1.getFirst().next.next.next = list1.getFirst().next;
		
		/*Iterator itr = list1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		System.out.println(checkLoops(list1));
		
		list1 = new LoopsInLinkedList();
		list1.insert(6);
		list1.insert(1);
		list1.insert(7);
		list1.insert(5);
		list1.insert(9);
		
		System.out.println(checkLoops(list1));
		
	}
	
	private static boolean checkLoops(LoopsInLinkedList list1){
		Node slowPointer = list1.getFirst();
		Node fastPointer = list1.getFirst();
		
		//while(slowPointer!=null){			
			while(fastPointer!=null && fastPointer.next!=null){				
				fastPointer = fastPointer.next.next;					
				if(slowPointer.value == fastPointer.value){				
					return true;
				}
				slowPointer = slowPointer.next;
			}
			
	/*		slowPointer = slowPointer.next;
		}*/
		return false;
	}

	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		Iterator listIterator = new ListIterator();
		return listIterator;
	}

}
