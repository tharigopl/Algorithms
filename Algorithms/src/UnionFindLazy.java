import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class UnionFindLazy {
	
	private int[] data;	
	
	public UnionFindLazy(int N){
		this.data = new int[N];
		for(int count = 0; count < this.data.length; count++){
			this.data[count] = count;
		}
	}
	
	private int findRoot(int element){
		
		while(data[element]!=element)
			element = data[element];
		
		return element;
	}
	
	public void union(int p, int q){
		int i = findRoot(p);
		int j = findRoot(q);
		data[i] = j;
	}
	
	public boolean connected(int p, int q){
		if(findRoot(p) == findRoot(q)){
			return true;
		}else
			return false;
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UnionFindLazy objUnionFindLazy = null;
		BufferedReader buff = new BufferedReader(new FileReader(args[0]));
		String inputLine = "";
		while((inputLine = buff.readLine())!=null)
		{
			String[] arrInput = inputLine.split(" ");
			if(arrInput.length == 1){
				if(arrInput[0] != null)
					objUnionFindLazy = new UnionFindLazy(Integer.parseInt(arrInput[0]));
			}else if(arrInput[0] != null & arrInput[1] != null){
				
				//objUnionFind.unionNaive(Integer.parseInt(arrInput[0]), Integer.parseInt(arrInput[1]));
				objUnionFindLazy.union(Integer.parseInt(arrInput[0]), Integer.parseInt(arrInput[1]));
			}
							
		}		
	}

}
