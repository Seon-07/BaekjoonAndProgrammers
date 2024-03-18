class Solution {
    public int solution(int[][] sizes) {
        int wid = 0;
        int hei = 0;
        for(int[] size: sizes){
            int max = Math.max(size[0],size[1]);
            int min = Math.min(size[0],size[1]);
            wid = wid < max ? max : wid;
            hei = hei < min ? min : hei;
        }
        return wid * hei;
    }
}