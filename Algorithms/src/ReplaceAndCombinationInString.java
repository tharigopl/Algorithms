import java.util.Iterator;


public class ReplaceAndCombinationInString {

	public static char[] cArr;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1??";
		//combination(str);
		Stack<Node> stack = new Stack<Node>();
		Node obj1 = new Node(10);
		stack.push(obj1);
		stack.push(new Node(11));
		
		Iterator itr = stack.iterator();
		
		while(itr.hasNext()){
			Node obj = (Node)itr.next();
			System.out.println(obj.id);
		}
		
		obj1.id = "23";
		itr = stack.iterator();
		while(itr.hasNext()){
			Node obj = (Node)itr.next();
			System.out.println(obj.id);
		}
		
		/*for(int a : stack){
			System.out.println(a);
		}*/
		
	}
	
	public static void combination(String input){
		cArr = input.toCharArray();
		System.out.println(cArr.length);
		recursiveCombination(0,"");
	}
	
	public static void recursiveCombination(int startIndex, String base){
		
		String newPrefix = "";
		System.out.println(base);
		
		if(startIndex == cArr.length)
			return;
		
		for(;startIndex<cArr.length;startIndex++){
			if(cArr[startIndex]=='?'){			
				newPrefix = base + '0';
				recursiveCombination(startIndex+1, newPrefix);
				newPrefix = base + '1';
				recursiveCombination(startIndex+1, newPrefix);
				
			}else{
				newPrefix = base + cArr[startIndex];
				recursiveCombination(startIndex+1, newPrefix);			
			}
		}
	}

}

