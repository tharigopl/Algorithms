import java.util.List;

public class IntersectionInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(7);
		list1.add(3);
		list1.add(8);
		list1.add(9);
		list1.add(13);
		
		LinkedList list2 = new LinkedList();
		list1.add(23);
		list1.add(7);
		list1.add(45);		
		list1.add(9);
		list1.add(13);
		
		System.out.println(intersectionNode(list1, list2).key);
	}
	
	public static Node intersectionNode(LinkedList node1, LinkedList node2){
		int maxSize = Math.max(node1.size, node2.size);	
		 
	}

}
