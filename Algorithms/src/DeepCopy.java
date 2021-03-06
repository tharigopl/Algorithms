public class DeepCopy {

	public static void main(String[] args) {		// TODO Auto-generated method stub
		Node node1 = new Node(1);
		buildTree(node1);
		postOrderTraversalIterative(node1);
//		preOrderTraversalIterative(node1);
		//inorderTraversalIterative(node1);
		//inOrderTraversal(node1);
		System.out.println();
		//inOrderTraversal(deepCopy(node1));
	}
	
	public static void preOrderTraversalIterative(Node node){
		Stack<Node> stack = new Stack<Node>();
		boolean done = false;
		Node root = node;
		
			if(node != null){
				stack.push(node);				
			}
			while(stack.iterator().hasNext()){
				node = stack.pop();
				System.out.print(node.key+ " ");
				if(node.next != null)
				stack.push(node.next);
				if(node.prev != null)
				stack.push(node.prev);
			}
		
	}
	
	public static void postOrderTraversalIterative(Node node){
		Stack<Node> stack = new Stack<Node>();
		boolean done = false;
		while(!done){
			
			if(node != null){
				stack.push(node);
				node = node.next;
			}
			else{
				if(stack.iterator().hasNext()){
					node = stack.pop();
					System.out.print(node.key+ " ");
					node = node.prev;
				}else
					done = true;
			}
		}
		
		
		
	}
	
	public static void inorderTraversalIterative(Node node){
		Stack<Node> stack = new Stack<Node>();
		boolean done = false;
		
		while(!done){
			
			if(node != null){
				stack.push(node);
				node = node.prev;
			}
			else{
				if(stack.iterator().hasNext()){
					node = stack.pop();
					System.out.print(node.key+ " ");
					node = node.next;
				}else
					done = true;
			}
		}
		
		
		
	}
	
	public static Node deepCopy(Node node){
		Node newNode = null;
		if(node!=null){
			newNode = new Node();
			newNode.key = node.key;
			Node temp = null;
			if( (temp = deepCopy(node.next)) != null)
				newNode.next = temp;
			temp = null;
			if( (temp = deepCopy(node.prev)) != null)
				newNode.prev = temp;
		}
		
		return newNode;
		
	}
	
	public static void inOrderTraversal(Node node){
		if(node == null){
			
		}else{
			inOrderTraversal(node.prev);
			System.out.print(node.key + " ");
			inOrderTraversal(node.next);
		}
	}
	
	public static Node buildTree(Node node){
		
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		
		node.prev = node2;
		node.next = node3;
		node2.prev = node4;
		node2.next = node5;
		node3.prev = node6;
		node3.next = node7;
		node4.prev = node8;
		node4.next = node9;
		
		/*Node node2 = new Node(5);
		Node node3 = new Node(25);
		Node node4 = new Node(3);
		Node node5 = new Node(9);
		Node node6 = new Node(12);
		Node node7 = new Node(35);
		Node node8 = new Node(2);
		Node node9 = new Node(1);
		
		node.prev = node2;
		node.next = node3;
		node2.prev = node4;
		node2.next = node5;
		node3.prev = node6;
		node3.next = node7;
		node4.prev = node8;
		node8.prev = node9;
		*/
		return node;
	}

}
