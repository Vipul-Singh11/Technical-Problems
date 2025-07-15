import java.util.ArrayList;

public class CycleDirectedGraph {
	static class Edge{
		int src;
		int dest;
		public Edge(int src, int dest) {
			this.src = src;
			this.dest = dest;
		}
	}
	static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0; i<graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 1));
		graph[2].add(new Edge(2, 1));
		graph[2].add(new Edge(2, 3));
		graph[3].add(new Edge(3, 4));
		graph[4].add(new Edge(4, 2));
	}
	public static boolean cyclicUtil(ArrayList<Edge> graph[], int curr, boolean[] vis, boolean[] stack) {
		vis[curr] = true;
		stack[curr]=true;
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if(vis[curr]) {
				return true;
			}else if(!vis[curr] && cyclicUtil(graph, e.dest, vis, stack)) {
				return true;
			}
		}
		stack[curr]=false;
		return false;
	}
	public static boolean isCyclic(ArrayList<Edge> graph[]) {
		boolean[] vis = new boolean[graph.length];
		for(int i=0; i<graph.length; i++) {
			if(vis[i]==false) {
				boolean cycle = cyclicUtil(graph, i, vis, new boolean[vis.length]);
				if(cycle) return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int n =5;
		ArrayList<Edge> graph[] = new ArrayList[n];
		createGraph(graph);
		System.out.println(isCyclic(graph));
	}
}
