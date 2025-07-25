import java.util.*;
public class GraphBFS {
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
		graph[0].add(new Edge(0, 1, 1));
		graph[0].add(new Edge(0, 2, 1));
		graph[1].add(new Edge(1, 0, 1));
		graph[1].add(new Edge(1, 3, 1));
		graph[2].add(new Edge(2, 0, 1));
		graph[2].add(new Edge(2, 4, 1));
		graph[3].add(new Edge(3, 1, 1));
		graph[3].add(new Edge(3, 4, 1));
		graph[3].add(new Edge(3, 5, 1));
		graph[4].add(new Edge(4, 2, 1));
		graph[4].add(new Edge(4, 3, 1));
		graph[4].add(new Edge(4, 5, 1));
		graph[5].add(new Edge(5, 3, 1));
		graph[5].add(new Edge(5, 4, 1));
		graph[5].add(new Edge(5, 6, 1));
		graph[5].add(new Edge(6, 5, 1));
	}
	public static void bfs(ArrayList<Edge> graph[], int n) {
		boolean[] visited = new boolean[n];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		while(!queue.isEmpty()) {
			int curr = queue.remove();
			if(!visited[curr]) {
				System.out.print(curr+" ");
				visited[curr] = true;
			}
			for(int i=0; i<graph[curr].size(); i++) {
				Edge e = graph[curr].get(i);
				queue.add(e.dest);
			}
		}
	}
    public static void main(String[] args) {
        int n = 7;
        ArrayList<Edge> graph[] = new ArrayList[n];
        graph(graph);
        bfs(graph, n);
    }
}
