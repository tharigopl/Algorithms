public class SumOfNodesInTree {

	public static int numberToSearch = 7;
	public static void main(String[] args) {		// TODO Auto-generated method stub
		Node node1 = new Node(10);
		buildTree(node1);		
		System.out.println(findPathWithSum(node1));
	}
	
	public static Node buildTree(Node node){
		
		Node node2 = new Node(5);
		Node node3 = new Node(26);
		Node node4 = new Node(3);
		Node node5 = new Node(9);
		Node node6 = new Node(12);
		Node node7 = new Node(35);
		Node node8 = new Node(2);
		Node node9 = new Node(1);
		Node node10 = new Node(4);
		
		node.prev = node2;
		node.next = node3;
		node2.prev = node4;
		node2.next = node5;
		node3.prev = node6;
		node3.next = node10;
		node3.next = node7;
		node4.prev = node8;
		node8.prev = node9;
		//node6.next = node10;
		
		return node;
	}
	
	public static boolean findPathWithSum(Node node){
		boolean result = false;
		result = findPathWithSum(node, 0);
		return result;
	}

	private static boolean findPathWithSum(Node node, int sum){
		boolean result = false;		
		if(node == null){
			return result;
		}else if(node.key == numberToSearch){
			return (result = true);
		}else{			
			sum = sum + node.key;
			if(sum > numberToSearch){
				if(node.key > numberToSearch)
					sum = 0;
				else
					sum = node.key;
				
				result = findPathWithSum(node.prev, sum);
				if(!result)
					result = findPathWithSum(node.next, sum);
			}else if(sum == numberToSearch){
				return (result = true);
			}
			else{
				if(node.key > numberToSearch)
					sum = 0;
				else
					sum = node.key;
				result = findPathWithSum(node.prev, sum);
				if(!result)
					result = findPathWithSum(node.next, sum);
			}
				
			return result;
		}
		
	}
	
}
