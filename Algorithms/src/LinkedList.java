public class LinkedList {
	public Node first;
	public int size;
	
	public LinkedList(){
		this.first = null;		
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int getSize(){
		if(this.isEmpty())
			return 0;
		else
			return this.size;
	}	
	
	public void add(int n){
		/*Node newNode = Node(n);
		if(this.isEmpty()){
			
		}*/
	}
	
}
