import java.util.*;
public class BellmanFord {
	static class Edge{
		int src;
		int dest;
		int wt;
		public Edge(int s, int d, int w) {
			this.src = s;
			this.dest = d;
			this.wt = w;
		}
	}
	static void graph(ArrayList<Edge> graph[]) {
		for(int i=0; i<graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		graph[0].add(new Edge(0, 1, 2));
		graph[0].add(new Edge(0, 2, 4));
		graph[1].add(new Edge(1, 2, -4));
		graph[2].add(new Edge(2, 3, 2));
		graph[3].add(new Edge(3, 4, 4));
		graph[4].add(new Edge(4, 1, -10));
	}
	public static void bellmanford(ArrayList<Edge> graph[], int src, int n) {
		int dist[] = new int[n];
		for(int i=0; i<n; i++) {
			if(i!=src) {
				dist[i] = Integer.MAX_VALUE;
			}
		}
		for(int k=0; k<n-1; k++) {
			for(int j=0; j<n; j++) {
				for(int i=0; i<graph[j].size(); i++) {
					Edge e = graph[j].get(i);
					int u = e.src;
					int v = e.dest;
					if(dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
						dist[v] = dist[u] + e.wt;
					}
				}
			}
		}
		for(int j=0; j<n; j++) {
			for(int i=0; i<graph[j].size(); i++) {
				Edge e = graph[j].get(i);
				int u = e.src;
				int v = e.dest;
				if(dist[u] != Integer.MAX_VALUE && dist[u] + e.wt < dist[v]) {
					System.out.println("Negative weigth cycle exist");
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(dist[i] + " ");
		}
	}
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Edge> graph[] = new ArrayList[n];
        graph(graph);
        bellmanford(graph, 0, n);
    }
}
