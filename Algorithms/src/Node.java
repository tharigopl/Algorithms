public class Node {
	public String id;
	public int value;
	public Node next;	
	public Node prev;
	
	public Node(){
	}
	
	public Node(int n,Node node){
		this.id = n+"";
		this.value = n;
		this.next = node;
		this.prev = null;
	}
	
}
