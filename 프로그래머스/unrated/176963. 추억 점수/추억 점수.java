class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for(int i=0;i< photo.length;i++){
            for(int j=0;j<photo[i].length;j++){
                for(int p=0;p<name.length;p++){
                    if(photo[i][j].equals(name[p])) answer[i]+=yearning[p];
                }
            }
        }
        return answer;
    }
}