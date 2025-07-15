import java.util.ArrayList;
public class GraphDFS {
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
		graph[6].add(new Edge(6, 5, 1));
	}
	static void dfs(ArrayList<Edge> graph[], int curr, Boolean[] vis) {
		System.out.print(curr + " ");
		vis[curr]= true;
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if(vis[e.dest] == false) {
				dfs(graph, e.dest, vis);
			}
		}
	}
	static void printallpath(ArrayList<Edge> graph[], int curr, Boolean[] vis, String path, int tar) {
		if(curr == tar) {
			System.out.println(path);
			return;
		}
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			if(vis[e.dest]==false) {
				vis[curr] = true;
				printallpath(graph, e.dest, vis, path+e.dest, tar);
				vis[curr] = false;
			}
		}
	}
    public static void main(String[] args) {
        int n = 7;
        ArrayList<Edge> graph[] = new ArrayList[n];
        Boolean[] visited = new Boolean[n];
        for(int i=0; i<n; i++) {
        	visited[i] = false;
        }
        graph(graph);
        //dfs(graph, 0, visited);
        printallpath(graph, 0, visited, "0", 3);
    }
}
