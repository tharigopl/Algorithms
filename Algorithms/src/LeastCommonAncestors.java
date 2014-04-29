
public class LeastCommonAncestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(1);
		node1 = buildTree(node1);
		leastCommonAncestors(node1, 3, 2);
	}
	
	public static Node leastCommonAncestors(Node node, int find1, int find2){
		
		if(node == null){
			
		}else{
			
		}
		
		return null;
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
		Node node10 = new Node(10);
		Node node11 = new Node(11);
		Node node12 = new Node(12);
		Node node13 = new Node(13);
		Node node14 = new Node(14);
		Node node15 = new Node(15);
		Node node16 = new Node(16);
		
		node.prev = node2;
		node.next = node3;
		node2.prev = node4;
		node2.next = node5;
		node3.prev = node6;
		node3.next = node7;
		node4.prev = node8;
		node4.next = node9;
		node9.next = node11;
		node11.next = node10;
		node7.prev = node12;
		node12.next = node13;
		node13.prev = node14;
		node14.next = node15;
		node15.prev = node16;
		
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
