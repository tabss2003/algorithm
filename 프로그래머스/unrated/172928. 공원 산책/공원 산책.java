class Solution {
   public int[] solution(String[] park, String[] routes) {
        int dogX = 0;
        int dogY = 0;

        char[][] map = new char[park.length][park[0].length()];

        for(int i=0;i<park.length;i++){
            map[i] = park[i].toCharArray();
            if(park[i].contains("S")){
                dogY =i;
                dogX = park[i].indexOf("S");
            }
        }

        for(String r: routes){
            String dir = r.split(" ")[0];
            int dis = Integer.parseInt(r.split(" ")[1]);

            int nx = dogX;
            int ny = dogY;

            for(int i=0;i<dis;i++){
                if(dir.equals("E")){
                    nx++;
                }else if(dir.equals("W")){
                    nx--;
                }else if(dir.equals("S")){
                    ny++;
                }else if(dir.equals("N")){
                    ny--;
                }

                if(nx>=0 && ny < map.length && ny>=0 && nx < map[0].length){
                    if(map[ny][nx] == 'X') break;
                    if(i == dis-1){
                        dogX = nx;
                        dogY = ny;
                    }
                }
            }
        }
        int[] answer = {dogY, dogX};
        return answer;
    }
}