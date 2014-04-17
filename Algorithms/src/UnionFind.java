import java.io.BufferedReader;
import java.io.FileReader;

public class UnionFind {
	
	private int[] data;	
	
	public UnionFind(int N){
		this.data = new int[N];
		for(int count = 0; count < this.data.length; count++){
			this.data[count] = count;
		}
	}
	
	public int[] getData(){
		return this.data;
	}
	
	//O(N^2)
	public void unionNaive(int a, int b){	
		int aid = a;
		int bid = b;
		for(int i=0;i<this.data.length;i++){
			if(this.data[i] == aid){
				this.data[i] = bid;
			}
		}
	}
	
	//LazyApproach
	public void unionLazy(int a, int b){
		
	}
	
	public boolean find(int a, int b){
		return this.data[a] == this.data[b];			
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UnionFind objUnionFind = null;
		
		BufferedReader buff = new BufferedReader(new FileReader(args[0]));
		String inputLine = "";
		while((inputLine = buff.readLine())!=null)
		{
			String[] arrInput = inputLine.split(" ");
			if(arrInput.length == 1){
				if(arrInput[0] != null)
					objUnionFind = new UnionFind(Integer.parseInt(arrInput[0]));
			}else if(arrInput[0] != null & arrInput[1] != null){
				objUnionFind.unionNaive(Integer.parseInt(arrInput[0]), Integer.parseInt(arrInput[1]));
			}
							
		}		
	}

}
