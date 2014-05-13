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
		Node newNode = new Node(n);
		Node temp = first;
		if(this.isEmpty()){
			first = newNode;
		}else{
			/*temp = first;
			first = newNode;
			newNode.next = temp;*/
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public Node remove(int n){
		Node temp = first;
		Node returnTemp = null;
		if(temp.key == n){
			first = null;
			return temp;
		}else{
			while(temp.key!= n){				
				temp = temp.next;
			}			
			returnTemp = temp;
			temp = temp.next;
			return returnTemp;
		}
	}
	
}
