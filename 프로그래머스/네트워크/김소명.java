import java.util.*;

class Solution {
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(!visited[i]){
                answer++;
                dfs(i, computers);
            }
        }
        return answer;
    }

    public void dfs(int x, int[][] arr){
        visited[x] = true;
        for(int i=0; i<arr.length; i++){
            if(!visited[i] && arr[x][i] == 1){
                dfs(i, arr);
            }
        }
    }
}