// https://leetcode.com/problems/all-paths-from-source-to-target/

import java.util.ArrayList;
import java.util.List;

class SolutionA {
    List<List<Integer>> ans = new ArrayList<>();
    public void solve(int[][] graph, int node, List<Integer> path){
        int n = graph.length;
        if(node == n - 1){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i : graph[node]){
            path.add(i);
            solve(graph, i, path);
            path.remove(path.size() - 1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        path.add(0);
        solve(graph, 0, path);
        return ans;
    }
}