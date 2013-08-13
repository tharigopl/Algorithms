public class Node {
	public Integer key;
	public Node next;	
	public Node prev;
	
	public Node(){
	}
	
	public Node(int n){		
		this.key = n;
		this.next = null;
		this.prev = null;
	}
	
}
