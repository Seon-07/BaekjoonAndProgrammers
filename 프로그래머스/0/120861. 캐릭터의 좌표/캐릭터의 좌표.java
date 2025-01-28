class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int xleng = board[0]/2;
        int yleng = board[1]/2;
        int[] result = new int[2];
        for(String str : keyinput){
            switch (str) {
                case "left" : 
                    result[0] -= 1;
                    if(result[0] <= -xleng) result[0] = -xleng;
                    break;
                case "right" : 
                    result[0] += 1;
                    if(result[0] >= xleng) result[0] = xleng;
                    break;
                case "up" : 
                    result[1] += 1;
                    if(result[1] >= yleng) result[1] = yleng;
                    break;
                case "down" : 
                    result[1] -= 1;
                    if(result[1] <= -yleng) result[1] = -yleng;
                    break;
            } 
        }
        return result;
    }
}