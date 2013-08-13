import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;


public class BFS {
	private boolean[] marked;
	private int[] edgeTo;
	private boolean[] markedCycle;
	private int[] edgeToCycle;
	private int source;
	
	public BFS(Graph graph, int source){
		this.source = source;
		marked = new boolean[Graph.noOfVertices(graph)];
		edgeTo = new int[Graph.noOfVertices(graph)];
		//markedCycle = new boolean[Graph.noOfVertices(graph)];
		//edgeToCycle = new int[Graph.noOfVertices(graph)];
		//breathFirstSearch(graph, source);
	}
	
	public void breathFirstSearch(Graph graph, int source){
		marked = new boolean[Graph.noOfVertices(graph)];
		edgeTo = new int[Graph.noOfVertices(graph)];
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(source);		
		marked[source] = true;
		int count = 0;
		while(!queue.isEmpty()){
			int v = queue.remove();
			Iterator<Integer> itr = graph.adj(v);
			count++;
			while(itr.hasNext()){
				
				int w = itr.next();
				if(!marked[w]){				
					queue.add(w);
					marked[w]=true;
					edgeTo[w]=v;
					System.out.println("Shortest Path from "+v+" to "+w+" is "+count);
				}				
			}		
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(3);
		//graph.addEdge(0, 1);
		graph.addEdge(0, 2);		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		BFS bfs = new BFS(graph, 0);
		bfs.breathFirstSearch(graph, 0);
		bfs.breathFirstSearch(graph, 1);
	}

}
