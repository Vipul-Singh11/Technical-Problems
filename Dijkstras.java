import java.util.*;
public class Dijkstras {
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
		graph[1].add(new Edge(1, 3, 7));
		graph[1].add(new Edge(1, 2, 1));
		graph[2].add(new Edge(2, 4, 3));
		graph[3].add(new Edge(3, 5, 1));
		graph[4].add(new Edge(4, 3, 2));
		graph[4].add(new Edge(4, 5, 5));
	}
	public static class Pair implements Comparable<Pair> {
		int node;
		int dist;
		public Pair(int n, int d) {
			this.node = n;
			this.dist = d;
		}
		@Override
		public int compareTo(Pair p2) {
			return this.dist - p2.dist;
		}
	}
	public static void dijkstra(ArrayList<Edge> graph[], int src, int n) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		int dist[] = new int[n];
		for(int i=0; i<n; i++) {
			if(i!=src) {
				dist[i] = Integer.MAX_VALUE;
			}
		}
		boolean[] vis = new boolean[n];
		pq.add(new Pair(0, 0));
		while(!pq.isEmpty()) {
			Pair curr = pq.remove();
			if(!vis[curr.node]) {
				vis[curr.node] = true;
				for(int i=0; i<graph[curr.node].size(); i++) {
					Edge e = graph[curr.node].get(i);
					int u = e.src;
					int v = e.dest;
					if(dist[u] + e.wt < dist[v]) {
						dist[v] = dist[u] + e.wt;
						pq.add(new Pair(v, dist[v]));
					}
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(dist[i] + " ");
		}
	}
    public static void main(String[] args) {
        int n = 6;
        ArrayList<Edge> graph[] = new ArrayList[n];
        graph(graph);
        dijkstra(graph, 0, n);
    }
}
