import java.util.HashMap;
import java.util.Iterator;


public class DFS {

	private boolean[] marked;
	private int[] edgeTo;
	private boolean[] markedCycle;
	private int[] edgeToCycle;
	private int source;
	
	public DFS(Graph graph, int source){
		this.source = source;
		marked = new boolean[Graph.noOfVertices(graph)];
		edgeTo = new int[Graph.noOfVertices(graph)];
		markedCycle = new boolean[Graph.noOfVertices(graph)];
		edgeToCycle = new int[Graph.noOfVertices(graph)];
		depthFirstSearch(graph, source);
	}
	
	public boolean isCyclicForDirectedGraph(Graph graph, int vertex, HashMap visitedNodes){		
		markedCycle[vertex] = true;
		visitedNodes.put(vertex, vertex);
		Iterator<Integer> itr = graph.adj(vertex);
		while(itr.hasNext()){
			int w = itr.next();
			if(!markedCycle[w] && !visitedNodes.containsKey(w)){
				if(isCyclicForDirectedGraph(graph,w, visitedNodes)){					
					return true;
				}
				visitedNodes.remove(w);
				edgeToCycle[w] = vertex;
			}else{
				return true;
			}
		}
		return false;
	}
	
	public boolean isCyclic(Graph graph, int vertex){
		markedCycle[vertex] = true;
		Iterator<Integer> itr = graph.adj(vertex);
		while(itr.hasNext()){
			int w = itr.next();
			if(!markedCycle[w]){
				if(isCyclic(graph,w))
					return true;
				edgeToCycle[w] = vertex;
			}else{
				return true;
			}
		}
		return false;
	}
	
	public void depthFirstSearch(Graph graph, int vertex){
		marked[vertex] = true;
		Iterator<Integer> itr = graph.adj(vertex);
		while(itr.hasNext()){
			int w = itr.next();
			if(!marked[w]){
				depthFirstSearch(graph,w);
				edgeTo[w] = vertex;
			}
		}
	}
	
	public boolean hasPathTo(int v){
		if(v < marked.length )
			return marked[v];
		else
			return false;
	}
	
	public Iterable<Integer> pathTo(int v){
		Stack<Integer> path = null;
		if(!hasPathTo(v)) return null;
		else{
			path = new Stack<Integer>();
			for(int x = v; edgeTo[x]!=source; x = edgeTo[x])
				path.push(x);
			path.push(source);			
		}
		return path;
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
		//graph.addEdge(2, 0);
		//graph.addEdge(1, 4);
		//graph.addEdge(0, 4);
		//graph.addEdge(0, 3);
		
		DFS objDFS = new DFS(graph, 0);
		//System.out.println(objDFS.isCyclic(graph, 0));
		System.out.println(objDFS.isCyclicForDirectedGraph(graph, 0, new HashMap()));
		
		objDFS.hasPathTo(4);
		Iterator itr = null;
		if(objDFS.pathTo(2)!=null){
			itr = objDFS.pathTo(2).iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}else{
			System.out.println("No path from source");
		}
		
		/*Iterator<Integer> itr = graph.adj(0);
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Degree "+ Graph.degree(graph, 1));
		System.out.println("No of Vertices "+ Graph.noOfVertices(graph));
		System.out.println("No of Edges "+ Graph.noOfEdges(graph));
		System.out.println("Max Degree "+ Graph.maxDegree(graph));
		System.out.println("Loops "+ Graph.countSelfLoops(graph));
		
		*/
	}

}
