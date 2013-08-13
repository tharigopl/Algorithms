import java.util.Iterator;
import java.util.ListIterator;


public class Stack<Item> implements Iterable<Item> {
		
	private Node first = null;
	
	private class Node{
		Item item;
		Node next;		
	}
	
	private boolean isEmpty(){
		return first == null;
	}
	
	public void push(Item item){
		Node oldNode = first;
		first = new Node();
		first.item = item;
		first.next = oldNode;
	}
	
	public Item pop(){
		Item item = null;
		if(!isEmpty())
		{
			item = first.item;
			first = first.next;
		}
		return item;
	}

	private class StackIterator implements Iterator<Item>{
		
		private Node current = first;	
		
		@Override
		public boolean hasNext() {
			return current!=null;			
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}		
	}	

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		Iterator<Item> listIterator = new StackIterator();
		return listIterator;
	}
	
	public void reverse(){
		reverseStack();
	}
	
	private void reverseStack(){
		if(isEmpty()){
			
		}else{
			Item temp = pop();
			reverseStack();
			recursivePush(temp);
		}
	}
	
	private void recursivePush(Item temp){
		if(isEmpty()){
			push(temp);
		}else{
			Item tempItem = pop();
			recursivePush(temp);
			push(tempItem);
		}
	}	
}
