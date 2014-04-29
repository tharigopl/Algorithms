
public class RightViewOfTheTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(1);
		buildTree(node1);
		printRightView(node1);
	}
	
	public static void printRightView(Node node){
		if(node != null){
			System.out.println(node.key);
			printRightView(node.next);
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
