import java.util.*;
class Solution {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for(int i=0;i<places.length;i++){
            String[] p = places[i];
            
            boolean isOk = true;
            for(int r =0;r<5 && isOk;r++){
                for(int c =0;c<5 && isOk;c++){
                    if(p[r].charAt(c) == 'P'){
                        if(!bfs(r,c,p)) isOk= false;
                    }
                }
            }
            answer[i] = isOk ? 1:0;
        }
        
        return answer;
    }
    private static boolean bfs(int r, int c, String[] p){
        int dr[] = {-1,1,0,0};
        int dc[] = {0,0,-1,1};
        
        Queue<int[]> que = new LinkedList<int[]>();
        que.add(new int[] {r,c});
        
        while(!que.isEmpty()){
            int[] position = que.poll();
            
            for(int i=0;i<4;i++){
                int nr = position[0] + dr[i];
                int nc = position[1] + dc[i];
                
                
                if(nr< 0 || nr>=5 || nc<0 || nc>=5 ||(nr ==r && nc ==c))    continue;
                
                int dir = Math.abs(nr-r) + Math.abs(nc-c);
                
                if(p[nr].charAt(nc) == 'P' && dir <=2){
                    return false;
                }else if(p[nr].charAt(nc) == 'O' && dir < 2){
                    que.add(new int[] {nr,nc});
                }
            }
        }
        return true;
        
    }
}