import java.util.*;
class Solution {
    static char[][] map;
    static boolean[][] visited;
    static int[] dx ={-1,1,0,0};
    static int[] dy ={0,0,-1,1};
    public List<Integer> solution(String[] maps) {
        List<Integer> answer = new ArrayList<>();
        map = new char[maps.length][maps[0].length()];
        visited = new boolean[maps.length][maps[0].length()];
        for(int i=0;i<maps.length;i++){
            map[i] = maps[i].toCharArray();
        }
        
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                if(!visited[i][j] && map[i][j] !='X'){
                    answer.add(bfs(i,j));
                }
            }
        }
        
        if(answer.isEmpty()){
            answer.add(-1);
        }
        Collections.sort(answer);
        return answer;
    }
    public int bfs(int x, int y){
        int sum =0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = true;
        
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int cx = temp[0];
            int cy = temp[1];
            
            sum+=map[cx][cy]-'0';
            
            for(int d=0;d<4;d++){
                int nx = dx[d]+ cx;
                int ny = dy[d]+ cy;
                
                if(nx <0 || ny<0 || nx>=map.length || ny>= map[0].length)
                    continue;
                if(!visited[nx][ny] && map[nx][ny]!='X'){
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx,ny});
                }
            }
        }
        return sum;
    }
}