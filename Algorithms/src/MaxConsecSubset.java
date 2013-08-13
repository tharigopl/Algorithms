import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MaxConsecSubset {
	
	int ccSize = 0, ccMin = 0, ccMax = 0;
	int tmpSize = 0, tmpMin = 0, tmpMax = 0;
	static HashMap<Integer, HashMap<Integer, Integer>> graph = new HashMap<Integer, HashMap<Integer, Integer>>();
	
	
	public void DFS(int nodeId, int groupId) {
		if (graph.get(nodeId).get(nodeId) == null) {
			graph.get(nodeId).put(nodeId, groupId);
						
			tmpSize++;
			if (nodeId > tmpMax) {
				tmpMax = nodeId;
			}
			
			if (nodeId < tmpMin) {
				tmpMin = nodeId;
			}
			
			for (Map.Entry<Integer, Integer> entry: graph.get(nodeId).entrySet()) {
				if (entry.getKey() != nodeId) {
					DFS(entry.getKey(), groupId);
				}
			}
		}
	}
	
	public void findEquivalenceClasses() {
		
		for (Map.Entry<Integer, HashMap<Integer, Integer>> entry: graph.entrySet()) {
			if (entry.getValue().get(entry.getKey()) == null) {
				tmpSize = 0; tmpMax = -999999; tmpMin = 999999;
				DFS(entry.getKey(), entry.getKey());
				
				if (tmpSize > ccSize) {
					ccSize = tmpSize;
					ccMin = tmpMin;
					ccMax = tmpMax;
				}
			}
		}		
	}	
	
	public void readInput() {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		Pattern delimiters = Pattern.compile(System.getProperty("line.separator")+"|\\s");
		scanner.useDelimiter(delimiters);
		int i;
		while(scanner.hasNextInt()) {
			i = scanner.nextInt();			
			
			if (!graph.containsKey(i)) {
				HashMap<Integer, Integer> adjElements = new HashMap<Integer, Integer>();
				adjElements.put(i, null);
				graph.put(i, adjElements);
			}
			
			if (graph.containsKey(i + 1)) {
				graph.get(i).put(i+1, null);				
				graph.get(i+1).put(i, null);
			}
			
			if (graph.containsKey(i - 1)) {
				graph.get(i).put(i-1, null);				
				graph.get(i-1).put(i, null);
			}
		}
	}
	
	public static void main(String[] args) {
		MaxConsecSubset maxCS = new MaxConsecSubset();
		maxCS.readInput();
		maxCS.findEquivalenceClasses();
		
		System.out.println("The maximum consecutive subset is:");
		for (int j = maxCS.ccMin; j <= maxCS.ccMax; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
	}
}