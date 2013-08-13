import java.util.ArrayList;
import java.util.Iterator;


public class Graph {
	private final int v;
	private ArrayList<Integer>[] adj;
	private int noOfEdges;
	
	public Graph(int v){
		this.v=v;
		adj = (ArrayList<Integer>[])new ArrayList[v];
		for(v = 0; v < this.v;v++){
			adj[v] = new ArrayList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination){
		adj[source].add(destination);
		//adj[destination].add(source);
		noOfEdges++;
	}
	
	public static int degree(Graph graph, int v){
		return graph.adj[v].size();
	}
	
	public static int noOfVertices(Graph graph){
		return graph.adj.length;
	}
	
	public static int noOfEdges(Graph graph){
		/*int noOfEdges = 0;
		for(int i = 0; i < graph.adj.length;i++){
			noOfEdges+=graph.adj[i].size();
		}*/
		return graph.noOfEdges;
	}
	
	public static int maxDegree(Graph graph){
		int maxDegree = 0;
		for(int i = 0; i < graph.adj.length; i++){
			maxDegree = Math.max(maxDegree, degree(graph,i));
		}
		return maxDegree;
	}
	
	public Iterator<Integer> adj(int v){
		return adj[v].iterator();
	}
	
	public static int countSelfLoops(Graph graph){
		int count = 0;
		for(int v = 0; v<graph.adj.length;v++){
			for(int w : graph.adj[v]){
				if(v == w) count++;
			}
			return count/2;
		}
		return 0;
	}
}
