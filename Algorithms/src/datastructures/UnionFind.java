package datastructures;

public class UnionFind {

	public int[] input;
	public int[] size;
	
	public UnionFind(int N){
		input = new int[N];
		size = new int[N];
		for(int i = 0 ; i < N; i++){
			input[i] = i;
		}
		for(int i = 0 ; i < N; i++){
			size[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnionFind union =  new UnionFind(10);
		union.eagerUnion(4, 3);
		union.eagerUnion(3, 8);
		union.eagerUnion(6, 5);
		union.eagerUnion(9, 4);
		union.eagerUnion(2, 1);
		
		System.out.println(union.areConnected(4, 9));
		System.out.println(union.areConnected(4, 2));
		
		union =  new UnionFind(10);
		union.quickUnion(4, 3);
		union.quickUnion(3, 8);
		union.quickUnion(6, 5);
		union.quickUnion(9, 4);
		union.quickUnion(2, 1);
		
		System.out.println(union.areConnectedQuickUnion(4, 9));
		System.out.println(union.areConnectedQuickUnion(4, 2));
		
		
		union =  new UnionFind(10);
		union.union(4, 3);
		union.union(3, 8);
		union.union(6, 5);
		union.union(9, 4);
		union.union(2, 1);
		
		System.out.println(union.areConnectedQuickUnion(4, 9));
		System.out.println(union.areConnectedQuickUnion(4, 2));
		
	}
	
	// Path compression
	public void unionWithPathCompression(int p, int q){
		int rootOfP = root(p);
		int rootOfQ = root(q);
			
		if(size[rootOfP] >= size[rootOfQ]){
			input[rootOfQ] = rootOfP;
			size[rootOfP] += size[rootOfQ];
		}else{
			input[rootOfP] = rootOfQ;
			size[rootOfQ] += size[rootOfP];
		}
		
	}
	
	public int rootWithPathCompression(int x){
		while(x != input[x]){
			input[x] = input[input[x]];
			x = input[x];
		}
		return x;
	}
	
	// Union Weighted Approach
	public void union(int p, int q){
		int rootOfP = root(p);
		int rootOfQ = root(q);
			
		if(size[rootOfP] >= size[rootOfQ]){
			input[rootOfQ] = rootOfP;
			size[rootOfP] += size[rootOfQ];
		}else{
			input[rootOfP] = rootOfQ;
			size[rootOfQ] += size[rootOfP];
		}
		
	}
	
	
	
	
	// Union lazy approach	
	public boolean areConnectedQuickUnion(int p, int q){
		return (root(p) == root(q))?true:false;
	}
	
	public int find(int x){
		while(x != input[x]){
			x = input[x];
		}
		return x;
	}
	
	public int root(int x){
		while(x != input[x]){
			x = input[x];
		}
		return x;
	}
	
	public void quickUnion(int p, int q){		
		input[root(p)] = root(q);
	}
	
	
	
	// Eager implementation
	public void eagerUnion(int p, int q){		
		
		if(areConnected(p, q)) return;
		for(int i = 0 ; i < input.length; i++){
			if(input[i] == input[p]){
				input[i] = input[q];
			}
		}
	}
	
	public boolean areConnected(int p, int q){
		return (input[p] == input[q])? true:false;
	}

}
