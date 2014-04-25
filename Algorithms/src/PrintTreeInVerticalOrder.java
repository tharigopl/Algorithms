import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;


public class PrintTreeInVerticalOrder {
	public static Integer min = 0;
	public static Integer max = 0;
	public static TreeMap<Integer, ArrayList<Node>> hm = new TreeMap<Integer, ArrayList<Node>>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(1);
		buildTree(node1);
		findMinAndMax(node1, 0);
		printVerticalTree(node1, 0);
		Iterator<Entry<Integer, ArrayList<Node>>> itr = hm.entrySet().iterator();
		
		while(itr.hasNext()){
			Map.Entry entry = (Map.Entry) itr.next();
		    Integer key = (Integer)entry.getKey();
		    ArrayList<Node> val = (ArrayList)entry.getValue();
		    
		    for(Node node : val){
		    	System.out.print(node.key+ " ");
		    }
		    System.out.println();
		}
		
		
	}
	
	public static void printVerticalTree(Node node, int horizontalDistance){		
		if(node == null){
			
		}else{
			if(hm.containsKey(horizontalDistance)){
				ArrayList<Node> list = hm.get(horizontalDistance);
				list.add(node);
				hm.put(horizontalDistance, list);
			}else{
				ArrayList<Node> list = new ArrayList<Node>();
				list.add(node);
				hm.put(horizontalDistance, list);
			}
			printVerticalTree(node.prev, horizontalDistance - 1);
			printVerticalTree(node.next, horizontalDistance + 1);
		}
	}
		
	public static void findMinAndMax(Node node, int horizontalDistance){		
		if(node.prev != null)
			findMinAndMax(node.prev, horizontalDistance - 1);
		else
			min = horizontalDistance;
		
		if(node.next != null)
			findMinAndMax(node.next, horizontalDistance - 1);
		else
			max = horizontalDistance;
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
