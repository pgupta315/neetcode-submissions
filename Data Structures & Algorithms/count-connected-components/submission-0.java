class Solution {
    static ArrayList<Integer> [] adjList;
    static boolean [] visited;

    public int countComponents(int n, int[][] edges) {
        // init adjList with empty arrays
        adjList = new ArrayList [n];
        for (int i=0; i<n; i++) {
            adjList[i] = new ArrayList<Integer>();
        }
        // fill the adjlist with neighbors
        for (int[] edge: edges) {
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }
        visited = new boolean[n];
        int comps = 0;
        for (int i=0; i<n; i++) {
            if (visited[i] == false) {
                dfs(i);
                comps++;
            }
        }
        return comps;
    }

    public void dfs(int node) {
        visited[node] = true;
        for (int neigh: adjList[node]) {
            if (!visited[neigh]) {
                dfs(neigh);
            }
        }
    }
}
