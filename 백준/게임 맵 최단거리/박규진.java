import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        //상우하좌(시계 방향)
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0});
        
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];
            
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                // maps 영역 밖x, 검은색 벽x, 이미 마킹된 곳 제외(1일 때만 탐색)
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1){
                    maps[nx][ny] = maps[x][y] + 1;
                    queue.add(new int[]{nx, ny});
                }
            } 
        }
        
        int answer = (maps[n-1][m-1] == 1)? -1 : maps[n-1][m-1];
        
        return answer;
    }
}
